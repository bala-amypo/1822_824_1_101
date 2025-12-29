package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
// public class User {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String name;
//     @Column
//     private String email;
//     private String password;
//     private LocalDateTime createdAt;

//     @ElementCollection(fetch = FetchType.EAGER)
//     @Enumerated(EnumType.STRING)
//     private Set<Role> roles;
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private LocalDateTime createdAt;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles;

   



    // getters/setters
    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public String getName(){ return name; }
    public void setName(String n){ this.name = n; }

    public String getEmail(){ return email; }
    public void setEmail(String e){ this.email = e; }

    public String getPassword(){ return password; }
    public void setPassword(String p){ this.password = p; }

    public LocalDateTime getCreatedAt(){ return createdAt; }
    public void setCreatedAt(LocalDateTime t){ this.createdAt = t; }

    public Set<Role> getRoles(){ return roles; }
    public void setRoles(Set<Role> r){ this.roles = r; }

    // builder
    public static Builder builder(){ return new Builder(); }
    public static class Builder {
        private final User u = new User();
        public Builder id(Long v){ u.setId(v); return this; }
        public Builder name(String v){ u.setName(v); return this; }
        public Builder email(String v){ u.setEmail(v); return this; }
        public Builder password(String v){ u.setPassword(v); return this; }
        public Builder createdAt(LocalDateTime v){ u.setCreatedAt(v); return this; }
        public Builder roles(Set<Role> v){ u.setRoles(v); return this; }
        public User build(){ return u; }
    }
}
