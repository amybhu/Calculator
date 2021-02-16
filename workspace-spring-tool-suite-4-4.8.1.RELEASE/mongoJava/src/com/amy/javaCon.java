package com.amy;

import java.util.*;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class javaCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Connecting With Server Please add the external jar file first
		MongoClient mongoClient = new MongoClient( "localhost" , 2727 );
		System.out.println("server connection successfully done");
		
		//Connecting with database
		MongoDatabase dbs = mongoClient.getDatabase("test");
        System.out.println("Connect to database successfully");
        System.out.println("Database Name"+dbs.getName());
        
        // To get all database names
		List<String> dbNames=mongoClient.getDatabaseNames();
        System.out.println(dbNames);
        
      //Drop Database
        
        mongoClient.dropDatabase("newDb");
        dbNames=mongoClient.getDatabaseNames();
        System.out.println(dbNames);

	}

}
