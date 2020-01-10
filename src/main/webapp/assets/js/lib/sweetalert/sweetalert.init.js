if(document.querySelector('.sweet-wrong') !=null && document.querySelector('.sweet-wrong') != undefined){
    document.querySelector('.sweet-wrong').onclick = function(){
        sweetAlert("Oops...", "Something went wrong !!", "error");
    };
}
if(document.querySelector('.sweet-message') !=null && document.querySelector('.sweet-message') != undefined){
    document.querySelector('.sweet-message').onclick = function(){
        swal("Hey, Here's a message !!")
    };
}
if(document.querySelector('.sweet-text') !=null && document.querySelector('.sweet-text') != undefined){
    document.querySelector('.sweet-text').onclick = function(){
        swal("Hey, Here's a message !!", "It's pretty, isn't it?")
    };
}
if(document.querySelector('.sweet-success') !=null && document.querySelector('.sweet-success') != undefined){
    document.querySelector('.sweet-success').onclick = function(){
        swal("Hey, Good job !!", "You clicked the button !!", "success")
    };
}
if(document.querySelector('.sweet-confirm') !=null && document.querySelector('.sweet-confirm') != undefined){
    document.querySelector('.sweet-confirm').onclick = function(){
        swal({
                title: "Are you sure to delete ?",
                text: "You will not be able to recover this imaginary file !!",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#DD6B55",
                confirmButtonText: "Yes, delete it !!",
                closeOnConfirm: false
            },
            function(){
                swal("Deleted !!", "Hey, your imaginary file has been deleted !!", "success");
            });
    };
}
if(document.querySelector('.sweet-success-cancel') !=null && document.querySelector('.sweet-success-cancel') != undefined){
    document.querySelector('.sweet-success-cancel').onclick = function(){
        swal({
                title: "Are you sure to delete ?",
                text: "You will not be able to recover this imaginary file !!",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#DD6B55",
                confirmButtonText: "Yes, delete it !!",
                cancelButtonText: "No, cancel it !!",
                closeOnConfirm: false,
                closeOnCancel: false
            },
            function(isConfirm){
                if (isConfirm) {
                    swal("Deleted !!", "Hey, your imaginary file has been deleted !!", "success");
                }
                else {
                    swal("Cancelled !!", "Hey, your imaginary file is safe !!", "error");
                }
            });
    };
}
if(document.querySelector('.sweet-image-message') !=null && document.querySelector('.sweet-image-message') != undefined){
    document.querySelector('.sweet-image-message').onclick = function(){
        swal({
            title: "Sweet !!",
            text: "Hey, Here's a custom image !!",
            imageUrl: "assets/images/hand.jpg"
        });
    };
}
if(document.querySelector('.sweet-html') !=null && document.querySelector('.sweet-html') != undefined){
    document.querySelector('.sweet-html').onclick = function(){
        swal({
            title: "Sweet !!",
            text: "<span style='color:#ff0000'>Hey, you are using HTML !!<span>",
            html: true
        });
    };
}
if(document.querySelector('.sweet-auto') !=null && document.querySelector('.sweet-auto') != undefined){
    document.querySelector('.sweet-auto').onclick = function(){
        swal({
            title: "Sweet auto close alert !!",
            text: "Hey, i will close in 2 seconds !!",
            timer: 2000,
            showConfirmButton: false
        });
    };
}
if(document.querySelector('.sweet-prompt') !=null && document.querySelector('.sweet-prompt') != undefined){
    document.querySelector('.sweet-prompt').onclick = function(){
        swal({
                title: "Enter an input !!",
                text: "Write something interesting !!",
                type: "input",
                showCancelButton: true,
                closeOnConfirm: false,
                animation: "slide-from-top",
                inputPlaceholder: "Write something"
            },
            function(inputValue){
                if (inputValue === false) return false;
                if (inputValue === "") {
                    swal.showInputError("You need to write something!");
                    return false
                }
                swal("Hey !!", "You wrote: " + inputValue, "success");
            });
    };
}
if(document.querySelector('.sweet-ajax') !=null && document.querySelector('.sweet-ajax') != undefined){
    document.querySelector('.sweet-ajax').onclick = function(){
        swal({
                title: "Sweet ajax request !!",
                text: "Submit to run ajax request !!",
                type: "info",
                showCancelButton: true,
                closeOnConfirm: false,
                showLoaderOnConfirm: true,
            },
            function(){
                setTimeout(function(){
                    swal("Hey, your ajax request finished !!");
                }, 2000);
            });
    };
}


