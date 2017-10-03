# ElasticSearch-JavaAPI
--Java API calls to ElasticSearch

--The Java API calls to the Elasticsearch were made through
two types of clients.
  -TransportClient
  -RestClient
  
--The given programs work on any system where the elasticsearch is configured in the local.

--The code was given to GET all the indexed data in JSON format.
--This can be changed to any type of API call and changed to any query to look like a native 
end point url query.

--# Please see that all the given dependencies in the build.gradle is given properly
and also see that the elastic search version configured in the local system and the
dependencies to import he elasticsearch version, transport-client version and rest-client
version are the same to avoid NoNodeAvailableException.
