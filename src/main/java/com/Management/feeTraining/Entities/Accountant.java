package com.Management.feeTraining.Entities;



import javax.persistence.*;


@Entity
@Table(name="accountants")
public class Accountant {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    //
//	@ManyToOne
//	@JoinColumn(name="accountant_id")
//	private User user;
//
    @Column(name="name")
    private  String name;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="address")
    private String address;

    @Column(name="contact")
    private String contact;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
