$(document).ready(function(){
    console.log("exprienceApiHandle 실행");
    const apiBtn = document.querySelector('#apiBtn');

    const source = $('#template-exp').html();
    const template = Handlebars.compile(source);

    function getExpList() {
        $.ajax({
            url: "/api/expList",
            type: "GET"
        }).done(function(result) {
            //result type is Array
            const data = {
                experienceList: result
            }
            const html = template(data);
            $('#experience-location').html(html); //appennd(), prepend()
        }).fail(function(xhr, error, status) {
            console.log(xhr);
        });
    }

    apiBtn.addEventListener('click', getExpList);
});