package config;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Seguridad {
    public static String Hash(String clave){
        String claveHash = null;
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(clave.getBytes(StandardCharsets.UTF_8));
            claveHash = Base64.getEncoder().encodeToString(digest);
        }catch(NoSuchAlgorithmException ex){
            System.err.println("No se pudo hashear: " + ex.getMessage());
        }
        return claveHash;
    }
}
    
