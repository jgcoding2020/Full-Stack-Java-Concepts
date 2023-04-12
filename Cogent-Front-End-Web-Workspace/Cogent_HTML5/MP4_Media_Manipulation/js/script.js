var ctx = document.getElementById("video-1");

function playPause(){
    if (ctx.paused)
        ctx.play();
    else
        ctx.pause();
    }

    function big(){
        ctx.height="600";
        ctx.width="600";
    }

    function normal(){
        ctx.height="300";
        ctx.width="300";
    }
    
    function small(){
        ctx.height="200";
        ctx.width="200";
    }