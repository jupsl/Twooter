package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        List<Twoot> twoots= Twoot.traemeLosUltimos();
        render(twoots);
    }
    public static void create(String mensaje){
        Twoot t= new Twoot(mensaje);
        t.save();
        render(t);
    
    }
    public static void twoots(){
     List<Twoot> twoots= Twoot.traemeLosUltimos();
        renderJSON(twoots);
    }

}