create database if not exists bingo;

use bingo;

CREATE TABLE IF NOT EXISTS players (
	player_id varchar(25),
	primary key (player_id)
);

CREATE TABLE IF NOT EXISTS games (
	game_id int AUTO_INCREMENT,
	game_starts datetime,
    primary key (game_id)
);

CREATE TABLE IF NOT EXISTS playersxgame (
	playersxgame_id int auto_increment,
	board_id int,
	game_id int,
	player_id varchar(25),
	position int,
	num int,
	is_played boolean,
    primary key (playersxgame_id),
    foreign key (game_id) references games(game_id),
    foreign key (player_id) references players(player_id)
);

CREATE TABLE IF NOT EXISTS mainboards (
	mainboard_id int,
	number_played int,
	game_id int,
	primary key (mainBoard_id),
	foreign key (game_id) references games(game_id)
);


