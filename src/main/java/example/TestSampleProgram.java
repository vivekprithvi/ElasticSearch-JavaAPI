package example;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.entity.NStringEntity;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.transport.NoNodeAvailableException;
import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

public class TestSampleProgram{
     public static void main(String[] args) throws IOException, UnknownHostException, NoNodeAvailableException {
          String hostname = "localhost";
          String clusterName = "elasticsearch";

//          Settings settings = ImmutableSettings.settingsBuilder().put("client.transport.sniff", true).put("cluster.name", clusterName).build();
//          Client esclient = new TransportClient(settings).addTransportAddress(new InetSocketTransportAddress(hostname, 9300));
          try{
        	  Settings settings=Settings.builder().put("client.transport.sniff",true).put("cluster.name",clusterName).build();
//          
//          TransportClient esclient = new PreBuiltTransportClient(settings)
//  		        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
          RestClient esclient=RestClient.builder(new HttpHost("localhost",9200,"http")).build();

          
//          String[] indexList = esclient.admin().cluster().prepareState().execute().actionGet().getState().getMetaData().getConcreteAllIndices();

//	  System.out.println("Index List:");
//	  for (String index : indexList) {
//	       System.out.println(index);
//          }
          
          HttpEntity entity = new NStringEntity(
        		  "{ \"query\": { \"match_all\": {}}}", ContentType.APPLICATION_JSON);
          Response indexResponse = esclient.performRequest(
        		  "GET",
        		  "_search",
        		  Collections.<String, String>emptyMap(),
        		  entity);
          
          System.out.println(EntityUtils.toString(indexResponse.getEntity()));
          }
          catch(NoNodeAvailableException | UnknownHostException e){ e.printStackTrace();}
     	}
}
