$(document).ready(function(){
    console.log("skillApiHandle 실행");
    const apiBtn = document.querySelector('#apiBtn');

    const source = $('#template-skill').html();
    const template = Handlebars.compile(source);

    function getSkillList() {
        $.ajax({
            url: "/api/skillList",
            type: "GET"
        }).done(function(result) {
            //result type is Array
            const data = {
                skillArray: result
            }
            const html = template(data);
            $('#skill-location').html(html); //appennd(), prepend()
        }).fail(function(xhr, error, status) {
            console.log(xhr);
        });
    }

    apiBtn.addEventListener('click', getSkillList);
});