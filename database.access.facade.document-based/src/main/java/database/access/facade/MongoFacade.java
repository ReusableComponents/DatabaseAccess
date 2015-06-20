package database.access.facade;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoFacade implements DatabaseFacade{
	public static final String SERVER_NAME = "localhost";
	public static final int PORT_NUM = 27017;
	public static MongoClient mc = null;	
	
	private MongoClient getClient(){
		if(this.mc == null){
			try {
				return new MongoClient(SERVER_NAME, PORT_NUM);
			} catch (UnknownHostException e) {		
				e.printStackTrace();				
			}
		}else{
			return this.mc;
		}
		return null;		
	}
	

	public void insert() {
		// TODO Auto-generated method stub
		
	}

	public void update() {
		// TODO Auto-generated method stub
		
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
