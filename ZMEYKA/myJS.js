// global variables
var FIELD_SIZE_X=20;//строки
var FIELD_SIZE_Y=20;//столбцы
var SNAKE_SPEED=300;//Интервал между перемещениями змейки
var snake=[];//сама змейка
var direction='y+';//Направление движения змейки
var gameIsRunning=false;//Запущена ли игра
var snake_timer;//Таймер змейки
var food_timer;//Таймер для еды
var score=0;//Результат

function init(){
	prepareGameField();//Генерация поля
	var wrap=document.getElementsByClassName('wrap')[0];
	wrap.style.width='400px';
	//События кнопок Старт и Новая игра
	document.getElementsById('snake-start').addEventListener('click',startGame);
	document.getElementsById('snake-renew').addEventListener('click',refreshGame);
	//Отслеживание клавиш клавиатуры
	addEventListener('keydown',changeDirection);
}
//-------------------------------------------------------------
