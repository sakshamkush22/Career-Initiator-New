$(document).ready(function(){
   
     $("#signupForm").submit(function(e){
 
        e.preventDefault(); 

        $.ajax({
            type: "POST",
            url: './ResiServ',  
            data: $(this).serialize(),

            success: function(res){
          alert("SERVER RESPONSE: " + res);
                if(res.trim() == "success"){
                        
                    $("#modal2").hide();                                    

                    $("#modal11").show();
                                            


                }else{
                    alert("Registration failed");
                }
            },

            error:function(){
                alert("Server problem");
            }
        });
        
        

    });

});


