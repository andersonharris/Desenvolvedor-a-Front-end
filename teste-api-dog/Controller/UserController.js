
        function muda_cor(selecionado){
               
               
                if(selecionado=="yellow"){
                   document["status_evento"].status.style.backgroundColor = "#e8e81f";
                    
	           }else if(selecionado=="red"){
                   document["status_evento"].status.style.backgroundColor = "#CC0035";
                   
	           }else if(selecionado=="blue"){
                   document["status_evento"].status.style.backgroundColor = "#1010ef";
                   
	           }else if(selecionado=="green"){
                   document["status_evento"].status.style.backgroundColor = "#078b07";
                   
	           }else if(selecionado=="purple"){
                   document["status_evento"].status.style.backgroundColor = "#8e0b8e";
                   
               }else{
                document["status_evento"].status.style.backgroundColor = "white";
               }
            }
          
           function muda_fonte(trocar){
               
               
                if(trocar=="Montserrat"){
               
		          document["status_font"].fontes.style.fontFamily = 'Montserrat,sans-serif';
                    
	           }else if(trocar=="Lato"){
		          document["status_font"].fontes.style.fontFamily = 'Lato,sans-serif';
                   
	           }else if(trocar=="Open-Sans"){
		          document["status_font"].fontes.style.fontFamily = 'Open,Sans','sans-serif';
                   
	           }else if(trocar=="Raleway"){
		          document["status_font"].fontes.style.fontFamily = 'Raleway','sans-serif';
                   
	           }else if(trocar=="Roboto-Mono"){
                 document["status_font"].fontes.style.fontFamily = 'Roboto,Mono','monospace';
                   
               }
            }



    function getDog(){

           $(document).ready(function(){
               
                carregar_json_fotos('image-content');
               function carregar_json_fotos(id){
                   var html = '';
                 
                   
                   $.getJSON('https://dog.ceo/api/breed/hound/images',function(data){
                         $.each(data.message, function(key, value){
                        
                      
                             
                          html += '<option>'+key+'</option>';
                
                        
                     $('#'+id).html(html);
                             

                    
                    console.log(key + ": " + value);
                        
                    })  ; 
                     
                       
                      
                   });
                   
                   
               }
               
           });

    }
        
function pegarFoto(){
    
    $('#getDog').on("click",function(){
        
        getDog();
        
        
    });
    
}
     
  pegarFoto();








            $(document).ready(function(){
                
                carregar_json('racas');
                
               function carregar_json(id){
                   var html = '';
                 
                   
                   // carregando os arquivos json
                   $.getJSON('https://dog.ceo/api/breeds/list/all',function(data){
                        html += '<option>Selecionar '+id+'</option>';
                       
                    $.each(data.message, function(key, value){
                        
                      
                             
                          html += '<option>'+key+'</option>';
                
                        
                     $('#'+id).html(html);
                        //console.log(key + ": " + value);
                        
                    })  ; 

                    console.log(data);


                   });  
                
                   
                   
               }
                     
                
                
            });
         

               
         
        

    
    
