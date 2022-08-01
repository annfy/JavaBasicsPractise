package com.guide.bascis;

/**
 * @author Jarvis
 * @version 1.0.1
 * @description
 * @date 2022-08-01 20:01
 */

public class JavaBascis {


      class Address implements Cloneable {

        private String name;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }


     class Person implements Cloneable{
        private Address address;

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Override
        public Person clone(){
            try {
                Person person=(Person) super.clone();
                return person;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }



    }



    public  void main(String[] args) {
        Person person=new Person();





    }


}
