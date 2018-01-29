angular.module('app', []).controller('rejestracjaController', function ($http) {
    var vm = this;
    console.log("wywolanie !angular");
    vm.addRejestracja = function (rejestracja) {
        rejestracja = vm.rejestracja;
        console.log("wywolanie http!");
        console.log("Debug "+rejestracja);
        $http({
            method: 'POST',
            url: 'http://localhost:8080/cepik/rejestracja',
            data: rejestracja
        }).then(function success(response) {
            vm.rejestracja = {};
        }, function error(response) {
            console.log('Data not saved ' + rejestracja);
        });
    }
});
console.log("wywolanie js !");
