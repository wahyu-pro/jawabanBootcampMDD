/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jawabanbootcamp;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class No_10 {
     public static void main(String[] args) {
        // buat json object root
        JSONObject jsonObjectRoot1 = new JSONObject();
        jsonObjectRoot1.put("id", 1);
        jsonObjectRoot1.put("name", "udin");
        jsonObjectRoot1.put("Age", "12");
        
        JSONObject jsonObjectRoot2 = new JSONObject();
        jsonObjectRoot2.put("id", 2);
        jsonObjectRoot2.put("name", "Reane");
        jsonObjectRoot2.put("Age", "51");
        
        JSONObject jsonObjectRoot3 = new JSONObject();
        jsonObjectRoot3.put("id", 3);
        jsonObjectRoot3.put("name", "Budi");
        jsonObjectRoot3.put("Age", "34");
        
        JSONObject jsonObjectRoot4 = new JSONObject();
        jsonObjectRoot4.put("id", 4);
        jsonObjectRoot4.put("name", "Agus");
        jsonObjectRoot4.put("Age", "16");
        
        JSONObject jsonObjectRoot5 = new JSONObject();
        jsonObjectRoot5.put("id", 5);
        jsonObjectRoot5.put("name", "Sari");
        jsonObjectRoot5.put("Age", "19");
        
        JSONObject jsonObjectRoot6 = new JSONObject();
        jsonObjectRoot6.put("id", 6);
        jsonObjectRoot6.put("name", "Ririn");
        jsonObjectRoot6.put("Age", "20");
        
        JSONObject jsonObjectRoot7 = new JSONObject();
        jsonObjectRoot7.put("id", 7);
        jsonObjectRoot7.put("name", "Dessy");
        jsonObjectRoot7.put("Age", "23");
        
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObjectRoot1);
        jsonArray.add(jsonObjectRoot2);
        jsonArray.add(jsonObjectRoot3);
        jsonArray.add(jsonObjectRoot4);
        jsonArray.add(jsonObjectRoot5);
        jsonArray.add(jsonObjectRoot6);
        jsonArray.add(jsonObjectRoot7);
        
       String data = jsonArray.toJSONString();
        
        System.out.println("Data JSON : " + data);
        
    }
}
