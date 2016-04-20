package com.Firsttemplate;
import java.io.*;
import java.util.*;
import freemarker.template.*;

public class TemplateController{
  public static void main(String[] args){
    try{
      Configuration cfg=new Configuration();
      cfg.setDirectoryForTemplateLoading(new File("."), List<object> city=new ArraryList<object>();
      Map<String,Object> model=new HashMap<String,Object>();
      String[] values=new String[]{"bangaluru","mariland"};
      for(String a:values)
        city.add(a);
      //String Input
      model.put("name","World");
      //number input
      model.put("age",25);
      //string formatting - Address input
      model.put("address","4th type 24 officers quarters, beml nagar, kgf");
      //gender input- true=male, false=female.
      model.put("gender",true);
      //String Object input- city{bangaluru,mariland}
      model.put("object",city);
      //Locale Object Input
      model.put("locale",Locale.ENGLISH);
      //list object - 2nd index input
      model.put("object",city.get(1));
      //print object type
      //System.out.println(Locale.US.getClass().getName()+" "+mylist.getClass().getName());
      Template template=cfg.getTemplate("helo.ftl");
      template.process(model,new OutputStreamWriter(System.out));
      }
      catch(IOException){
        e.printStackTrace();
      }
      catch(TemplateException e){
        e.printStackTrace();
      }
    }
  }
}
