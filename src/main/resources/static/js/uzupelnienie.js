angular.module('app', []).controller('uzupelnienieController', function ($http) {
    var vm = this;
    console.log("Inicjowanie angulara");
    vm.uzupelnij = function (UzupelnijDaneRequest) {
        console.log("Wywolanie http!");
        $http({
            method: 'POST',
            url: 'http://localhost:8080/cepik/uzupelnienie',
            data: UzupelnijDaneRequest
        }).then(function success(response) {
            vm.UzupelnijDaneRequest = {};
            console.log(response);
        }, function error(response) {
            console.log('Data not saved ' + UzupelnijDaneRequest);
        });
    }
});
console.log("wywolanie js !");
