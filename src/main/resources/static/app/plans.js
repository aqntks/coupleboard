var main = {
    init : function () {
        var _this = this;
        $('#btn-plan-save').on('click', function () {
            _this.save();
        });

        $('#btn-plan-update').on('click', function () {
            _this.update();
        });

        $('#btn-plan-delete').on('click', function () {
            _this.delete();
        });
    },
    save : function () {
        var data = {
            year: $('#year').val(),
            month: $('#month').val(),
            date: $('#date').val(),
            place: $('#place').val(),
            content: $('#content').val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/v1/plans',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('계획이 등록되었습니다.');
            window.location.href = '/plan';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
    update : function () {
        var data = {
            year: $('#year').val(),
            month: $('#month').val(),
            date: $('#date').val(),
            place: $('#place').val(),
            content: $('#content').val()
        };

        var id = $('#id').val();

        $.ajax({
            type: 'PUT',
            url: '/api/v1/plans/'+id,
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('계획이 수정되었습니다.');
            window.location.href = '/plan';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
    delete : function () {
        var id = $('#id').val();

        $.ajax({
            type: 'DELETE',
            url: '/api/v1/plans/'+id,
            dataType: 'json',
            contentType:'application/json; charset=utf-8'
        }).done(function() {
            alert('계획이 삭제되었습니다.');
            window.location.href = '/plan';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }

};

main.init();