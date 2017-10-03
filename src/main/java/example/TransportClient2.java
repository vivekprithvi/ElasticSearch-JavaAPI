package example;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.node.Node;
//import static org.elasticsearch.node.NodeBuilder.*;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

public class TransportClient2 {

	public void init() throws UnknownHostException{
//		TransportAddress address=new InetSocketTransportAddress(InetAddress.getByName("localhost"),9300);
		
//		Client client=new PreBuiltTransportClient(Settings.EMPTY).addTransportAddress(address);
		
//		Client client=NodeBuilder.nodeBuilder().clusterName("elasticsearch").client(true).node();
		
//		Client client = new TransportClient().addTransportAddress(new InetSocketTransportAddress("localhost", 9300));
//		Node node = nodeBuilder().clusterName("yourclustername").node();
//		Client client = node.client();
		TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
		        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("host1"), 9300))
		        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("host2"), 9300));

		
		
		
		
	}
}
