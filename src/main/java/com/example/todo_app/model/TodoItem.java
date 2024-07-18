package com.example.todo_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;



@Entity
public class TodoItem {


   @Id
   @GeneratedValue

       private Long id;
       @NonNull
       public String title;

        public boolean done;

        public  TodoItem(Long id, String title, boolean done) {
            this.id = id;
            this.title = title;
            this.done = done;
        }

        public Long getId(){
            return id;
        }


        public void setId(Long id){
            this.id = id;
        }

        public  String getTitle(){
            return title;
        }

        public void setTitle(String title){
            this.title = title;
        }

        public  boolean getDone(){
            return done;
        }
          public void setDone(boolean done){
            this.done = done;
          }

}
