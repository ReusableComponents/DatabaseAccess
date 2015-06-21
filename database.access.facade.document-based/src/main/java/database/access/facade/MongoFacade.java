package database.access.facade;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MongoFacade implements DatabaseFacade{
	private static final String SERVER_NAME = "localhost";
	private static final int PORT_NUM = 27017;
	private static final String DATABASE_NAME = "healassistDB";
	private static MongoClient mc = null;	
	
	public MongoFacade(){
		try{
			this.mc = new MongoClient(SERVER_NAME, PORT_NUM);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private MongoClient getClient(){
		return this.mc;		
	}
	
	private DB getDatabase(){
		return this.getClient().getDB(DATABASE_NAME);
	}
	
	private DBCollection getCollection(String name){
		return (DBCollection)this.getDatabase().getCollection(name);
	}
	
	public void insert() {		
		DBObject doc = new BasicDBObject();
		doc.put("key1", "value1");
		doc.put("key2", "value2");
		doc.put("key3", "value3");
		this.getCollection("physicians").insert(doc);
	}

	public void update() {		
		
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

	public void find() {
		MongoClient client = this.getClient();
		DB db = client.getDB("healassistDB");
		DBCollection physicians = db.getCollection("physicians");
		
		BasicDBObject query = new BasicDBObject();
		query.put("firstname", "Jacob");
		com.mongodb.DBCursor cursor = physicians.find();
		
		while(cursor.hasNext()){
			System.out.println(cursor.next());
		}		
	}

	public void find(String id) {
		// TODO Auto-generated method stub
		
	}

}
