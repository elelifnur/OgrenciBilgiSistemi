package Siniflar;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    double avarage1=0.0;
    double avarage2=0.0;
    double avarage3=0.0;
    boolean isPass;

    Student(String name,String stuNo,String classes, Course c1, Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.avarage1=0.0;
        this.avarage2=0.0;
        this.avarage3=0.0;
        this.isPass=false;
    }

    void addBulExamNote(int note1, int note2, int note3){
        if(note1 >= 0 && note1 <= 100){
            this.c1.note=note1;

        }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note=note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note=note3;
        }


    }
    void addBulVerbal(int verbal1, int verbal2, int verbal3){
        if(verbal1 >= 0 && verbal1 <= 100){

        }
        if(verbal2 >= 0 && verbal2 <= 100){
            this.c2.verbal=verbal2;

        }
        if(verbal3 >= 0 && verbal3 <= 100){
            this.c3.verbal=verbal3;

        }
    }
    void isPass(){
        System.out.println("==============");
        this.avarage1=((this.c1.verbal*0.20)+(this.c1.note*0.80));
        this.avarage2=((this.c2.verbal*0.20)+(this.c2.note*0.80));
        this.avarage3=((this.c3.verbal*0.20)+(this.c3.note*0.80));
        this.avarage = (this.avarage1+this.avarage2+this.avarage3)/3.0;
        if(this.avarage > 55){
            System.out.println("Hababam sınıfı uyanıyor!");
            this.isPass=true;
        }else{
            System.out.println("Hababam sınıfı sınıfta kaldı!");
            this.isPass=false;
        }
        printNote();
    }
    void printNote(){

        System.out.println(this.c1.name+"Notu:"+this.c1.note);
        System.out.println(this.c2.name+"Notu:"+this.c2.note);
        System.out.println(this.c3.name+"Notu:"+this.c3.note);
        System.out.println("Ortalamanız : "+this.avarage);
        System.out.println("Tarih Ortalamanız: "+this.avarage1);
        System.out.println("Fizik  Ortalamanız: "+this.avarage2);
        System.out.println("biyoloji Ortalamanız: "+this.avarage3);

    }
}
