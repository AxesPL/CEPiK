angular.module('app', []).controller('rejestracjaController', function ($http) {
    var vm = this;
    console.log("Inicjowanie angulara");
    vm.addRejestracja = function (rejestracja) {
        rejestracja = vm.rejestracja;
        console.log("Wywolanie http!");
        $http({
            method: 'POST',
            url: 'http://localhost:8080/cepik/rejestracja',
            data: rejestracja
        }).then(function success(response) {
            vm.rejestracja = {};
            console.log(response);
        }, function error(response) {
            console.log('Data not saved ' + rejestracja);
        });
    }
});
console.log("wywolanie js !");
