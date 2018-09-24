$(document).ready(function () {
    $('#calcular').click(function () {
        $.ajax('aluno', {
            method: 'GET',
            data: {
                nome: $('#nome').val(),
                p1: $('#p1').val(),
                p2: $('#p2').val()
            },
            success: function (data) {
                $('#media').val(data.media);
                $('#aprovado').val(data.aprovado ? 'Sim' : 'Não');
            },
            statusCode: {
                400: function () {
                    alert('Por favor, entre com notas válidas!');
                }
            }
        });
    });
});
 