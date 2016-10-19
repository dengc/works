$(".img").click(function(){
  $(this).css("opacity","0.3");
  $(".img1").removeClass("img1");
  $(this).addClass("img1");
})

$(".backimg").hover(function(){
  $(this).css("opacity","4 ");
})

$(".backimg").click(function(){
  $(".img1").css("opacity","1");
})
