-- phpMyAdmin SQL Dump
-- version 2.8.1
-- http://www.phpmyadmin.net
-- 
-- ホスト: localhost
-- 作成の時間: 2007 年 3 月 25 日 04:47
-- サーバーのバージョン: 5.0.21
-- PHP バージョン: 5.1.4
-- 
-- データベース: `storyteller`
-- 

-- --------------------------------------------------------

-- 
-- テーブルの構造 `VERB`
-- 

CREATE TABLE `VERB` (
  `ID` int(11) NOT NULL auto_increment,
  `TWOOBJECTS` tinyint(4) NOT NULL,
  `VALID` tinyint(4) NOT NULL,
  `NAME` varchar(255) character set utf8 collate utf8_bin NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

-- 
-- テーブルのダンプデータ `VERB`
-- 

INSERT INTO `VERB` VALUES (1, 0, 0, 0x525353426c6f636b);
INSERT INTO `VERB` VALUES (2, 0, 1, 0x43525544);
INSERT INTO `VERB` VALUES (3, 0, 0, 0x5253534578706f7274);
INSERT INTO `VERB` VALUES (4, 0, 0, 0x496e707574527373);
INSERT INTO `VERB` VALUES (5, 0, 0, 0x47726570527373);
INSERT INTO `VERB` VALUES (6, 0, 1, 0x414c4c);
