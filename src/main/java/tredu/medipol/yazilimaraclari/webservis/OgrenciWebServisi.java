package tredu.medipol.yazilimaraclari.webservis;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController 
@RequestMapping("/ogrenci")
public class OgrenciWebServisi {
	
   public record Ogrenci(String adSoyad, String numara) {}
	
   private static final List<Ogrenci> OGRENCI_LISTESI = new ArrayList<>();
   static {
	   OGRENCI_LISTESI.add(new Ogrenci("Serhat Esen" , "99"));
	   OGRENCI_LISTESI.add(new Ogrenci("Serhat Kesen" , "999"));
	   OGRENCI_LISTESI.add(new Ogrenci("Ali Veli" , "123456"));
   }
   
   @GetMapping("/")
   public List<Ogrenci> listele() {
	   return OGRENCI_LISTESI;
   }
}

