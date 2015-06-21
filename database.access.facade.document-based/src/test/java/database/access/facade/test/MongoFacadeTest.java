package database.access.facade.test;

import database.access.facade.DatabaseFacade;
import database.access.facade.MongoFacade;
import junit.framework.TestCase;

/* 
 * 
*/
public class MongoFacadeTest extends TestCase{
	DatabaseFacade facade;
	protected void setUp(){
		//Setup test cases
		this.facade = new MongoFacade();
	}
	
	
}
