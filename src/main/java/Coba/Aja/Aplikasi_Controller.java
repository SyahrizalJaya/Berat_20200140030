/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coba.Aja;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author JAYA
 */
@Controller
@ResponseBody
public class Aplikasi_Controller {
    @RequestMapping("/loop")
    public String getLooping(){
            String hasil = "";
            
            for(int count = 55; count >=-1; count --){
                hasil += "Hasil :"+count+"<br>";
            }
        return hasil;
    }
    
    
    @RequestMapping("/berat")
    public String getBerat(){
        String konversi = " ";
        
        double kilogram = 50;
        double ons = 40.5;
        double gram = 100;
        
        double berat;
        
        String pilih = "ons";
        
        if(pilih == "ons"){
            berat = kilogram*35.274;
            konversi = kilogram +"kg"+"<br>" +"berat ons : " +berat+"kg";
        }
        else if (pilih == "kg1"){
            berat = ons/35.274;
            konversi = ons + "ons" + "<br>" +"berat kilogram : "+berat+"ons";
        }
        else if (pilih == "g"){
            berat = kilogram*1000;
            konversi = kilogram+"kg"+"<br>"+"berat gram : "+berat+"g";
        }
        else if (pilih == "kg2"){
            berat = gram/1000;
            konversi = gram+"g"+"<br>"+"berat kilogram : "+berat + "kg";        }
        else{
            konversi = "Tidak ditemukan";
        }
        return konversi;
    }
}

