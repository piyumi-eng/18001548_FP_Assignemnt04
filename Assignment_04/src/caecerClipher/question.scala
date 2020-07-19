package caecerClipher

object question {
  def main(args:Array[String])
  {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    
    //Encryption function
    
    val encryption = (c:Char,key:Int,a:String)=>
                  a((a.indexOf(c.toUpper)+key)%a.size)
                  
    //Decryption function
                  
    val decryption = (c:Char,key:Int,a:String)=>
                  a((a.indexOf(c.toUpper)-key+26)%a.size)
                  
    val cipher = (algo:(Char,Int,String)=>
                 Char,s:String,key:Int,a:String)=>
                 s.map(algo(_,key,a))
                 
    val message = "HappyBirthday";
                 println("String is : "+message);
                 println("Enter key : ");
                 var key = scala.io.StdIn.readInt();
                 
                 val encrypted_text = cipher(encryption,message, key, alphabet);
                 val plain_text = cipher(decryption,encrypted_text,key, alphabet);
                 println("Encrypted message : "+encrypted_text);
                 println("Decrypted message : "+plain_text);
                 
  }
}