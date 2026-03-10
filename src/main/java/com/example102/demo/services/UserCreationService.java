package com.example102.demo.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class UserCreationService {
    public String guardarUsuario(String username, String email){
        try {
            Firestore db = FirestoreClient.getFirestore();

            Map<String, Object> data = new HashMap<>();
            data.put("username", username);
            data.put("email", email);
            
            db.collection("Users")
                    .document(username)
                    .set(data);
            return "Usuario guardado correctamente";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al guardar usuario";
        }
    }
}
