-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 2015 年 4 月 23 日 11:05
-- サーバのバージョン： 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `storyteller`
--

-- --------------------------------------------------------

--
-- テーブルの構造 `ANDROMDA_CORE_JAR_FILE`
--

CREATE TABLE IF NOT EXISTS `ANDROMDA_CORE_JAR_FILE` (
`ID` int(11) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `ANDROMDA_CORE_JAR_FILE`
--

INSERT INTO `ANDROMDA_CORE_JAR_FILE` (`ID`) VALUES
(1);

-- --------------------------------------------------------

--
-- テーブルの構造 `ATTR`
--

CREATE TABLE IF NOT EXISTS `ATTR` (
`ID` int(11) NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `CLASSTYPE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `JAPANESE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `NOUN_FK` int(11) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `ATTR`
--

INSERT INTO `ATTR` (`ID`, `NAME`, `CLASSTYPE`, `JAPANESE`, `NOUN_FK`) VALUES
(1, 'contentType', 'String', '', 1),
(2, 'id', 'String', '', 1),
(3, 'content', 'String', '', 1),
(4, 'width', 'int', '', 1),
(5, 'height', 'int', '', 1),
(6, 'x', 'int', '', 1),
(7, 'y', 'int', '', 1),
(8, 'contentType', 'String', '', 2),
(9, 'id', 'String', '', 2),
(10, 'content', 'String', '', 2),
(11, 'width', 'int', '', 2),
(12, 'height', 'int', '', 2),
(13, 'x', 'int', '', 2),
(14, 'y', 'int', '', 2),
(15, 'x', 'int', '', 3),
(16, 'y', 'int', '', 3),
(17, 'width', 'int', '', 3),
(18, 'height', 'int', '', 3),
(19, 'id', 'Integer', '', 3),
(20, 'id', 'Integer', '', 4),
(21, 'link', 'noun', '', 4),
(22, 'negative', 'boolean', '', 4),
(23, 'master', 'boolean', '', 1),
(24, 'likelihood', 'float', '', 10),
(25, 'linkUseCount', 'int', '', 10),
(26, 'linkUseCancelationCount', 'int', '', 10),
(27, 'id', 'Integer', '', 11),
(28, 'nodes', 'Collection', '', 11),
(29, 'linkUses', 'Collection', '', 11),
(30, 'id', 'Integer', '', 12),
(31, 'nodes', 'Collection', '', 12),
(32, 'id', 'Integer', '', 7),
(33, 'done', 'boolean', '', 7),
(34, 'triedAtLeastOnce', 'boolean', '', 7),
(35, 'oneshot', 'boolean', '', 7),
(36, 'scaleWith', 'String', '', 7),
(37, 'cf', 'boolean', '', 7),
(38, 'timeIncrease', 'int', '', 7),
(39, 'moneyIncrease', 'int', '', 7),
(40, 'moneyIncreaseAsSideEffect', 'int', '', 7),
(41, 'sideEffectPossibility', 'int', '', 7),
(42, 'timeNeeded', 'int', '', 7),
(43, 'moneyNeeded', 'int', '', 7),
(44, 'outsourcability', 'int', '', 7),
(45, 'totalNeeded', 'float', '', 7),
(46, 'simpleRoi', 'double', '', 7),
(47, 'totalIncrease', 'int', '', 7),
(48, 'breakdown', 'boolean', '', 7),
(49, 'essentialisable', 'boolean', '', 7),
(50, 'brokenDown', 'boolean', '', 7),
(51, 'possibility', 'int', '', 7),
(52, 'id', 'Integer', '', 13),
(53, 'universal', 'boolean', '', 13),
(54, 'asowner', 'boolean', '', 13),
(55, 'type', 'String', '', 13),
(56, 'name', 'String', '', 5),
(57, 'id', 'Integer', '', 5),
(58, 'mail', 'String', '', 5),
(59, 'nodeFields', 'Collection', '', 5),
(60, 'profile', 'String', '', 5),
(61, 'developer', 'boolean', '', 5),
(62, 'password', 'String', '', 5);

-- --------------------------------------------------------

--
-- テーブルの構造 `ATTR_USE`
--

CREATE TABLE IF NOT EXISTS `ATTR_USE` (
`ID` int(11) NOT NULL,
  `ATTR_FK` int(11) NOT NULL,
  `NOUN_USE_FK` int(11) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `ATTR_USE`
--

INSERT INTO `ATTR_USE` (`ID`, `ATTR_FK`, `NOUN_USE_FK`) VALUES
(1, 3, 3),
(2, 4, 3),
(3, 5, 3),
(4, 6, 3),
(5, 7, 3),
(6, 4, 6),
(7, 5, 6),
(8, 3, 5),
(9, 4, 7),
(10, 5, 7),
(11, 6, 7),
(12, 7, 7);

-- --------------------------------------------------------

--
-- テーブルの構造 `causal_relation`
--

CREATE TABLE IF NOT EXISTS `causal_relation` (
  `id` int(11) NOT NULL,
  `ATTR_FK` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `CLIENT`
--

CREATE TABLE IF NOT EXISTS `CLIENT` (
  `ID` int(8) NOT NULL,
  `NAME` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `CLIENT`
--

INSERT INTO `CLIENT` (`ID`, `NAME`) VALUES
(1, 'TEST');

-- --------------------------------------------------------

--
-- テーブルの構造 `COMMON_TRANSLATION`
--

CREATE TABLE IF NOT EXISTS `COMMON_TRANSLATION` (
`ID` int(11) NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `JAPANESE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=118 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `COMMON_TRANSLATION`
--

INSERT INTO `COMMON_TRANSLATION` (`ID`, `NAME`, `JAPANESE`) VALUES
(1, 'name', '名前'),
(2, 'id', 'id'),
(3, 'filename', 'ファイル名'),
(4, 'account', 'アカウント'),
(5, 'responsible', '担当者'),
(6, 'mail', 'メール'),
(7, 'password', 'パスワード'),
(8, 'admin', '管理者'),
(9, 'pref', '県'),
(10, 'phone', '電話番号'),
(11, 'buildingname', '建物名'),
(12, 'keitai', '携帯番号'),
(13, 'address', 'アドレス'),
(14, 'birthyear', '生年'),
(15, 'birthmonth', '生月'),
(16, 'mailforconfirm', 'メール確認'),
(17, 'brithday', '誕生日'),
(18, 'male', '男性'),
(19, 'blocknumber', '住所'),
(20, 'kana', 'カナ'),
(21, 'delivertodifferentaddress', '別のアドレスへ'),
(22, 'deliveryname', '名前'),
(23, 'deliveryaddress', '住所'),
(24, 'deliveryblocknumber', '住所'),
(25, 'deliverykana', 'カナ'),
(26, 'deliveryphone', '電話番号'),
(27, 'deliverydate', '配送日'),
(28, 'devliveryhour', '配送時間'),
(29, 'ordernum', '注文数'),
(30, 'carriage', '送料'),
(31, 'subtotal', 'サブトータル'),
(32, 'price', '金額'),
(33, 'tax', '消費税'),
(34, 'pricewithtax', '税込み'),
(35, 'code', 'コード'),
(36, 'date', '日付'),
(37, 'size', 'サイズ'),
(38, 'misc', 'その他'),
(39, 'material', '素材'),
(40, 'color', '色'),
(41, 'attachment', '付属品'),
(42, 'description', '説明'),
(43, 'stocknum', '在庫数'),
(44, 'totalfixedprice', '合計在庫数'),
(45, 'weight', '重さ'),
(46, 'attention', '注意書き'),
(47, 'pub', '公開'),
(48, 'Inquiry', '問い合わせ'),
(49, 'Category', 'カテゴリー'),
(50, 'SubCategory', 'サブカテゴリー'),
(51, 'Brand', 'ブランド'),
(52, 'Desinger', 'デザイナー'),
(53, 'Cart', 'カート'),
(54, 'Choise', '選択'),
(55, 'Favorite', 'お気に入り'),
(56, 'News', 'ニュース'),
(57, 'title', 'タイトル'),
(58, 'content', 'コンテンツ'),
(59, 'IntraUser', '内部ユーザー'),
(60, 'Prefecture', '県'),
(61, 'Holliday', '休日'),
(62, 'type', '種類'),
(63, 'value', '値'),
(64, 'removed', '削除済み'),
(65, 'accepted', '受領済み'),
(66, 'deadline', '納期'),
(67, 'current', '現行'),
(68, 'attribute', '属性'),
(69, 'modelname', 'モデル名'),
(70, 'Privilege', '権限'),
(71, 'Product', '製品'),
(72, 'Componey', '企業'),
(73, 'Manual', 'マニュアル'),
(74, 'intraUser', '内部ユーザー'),
(75, 'publicUser', '一般ユーザー'),
(76, 'PublicUser', '一般ユーザー'),
(77, 'product', '製品'),
(78, 'test', 'テスト'),
(79, 'j2eeStory', 'ストーリー'),
(80, 'noun', '名詞'),
(81, 'japanese', '日本語'),
(82, 'classtype', 'classtype'),
(83, 'attr', '属性'),
(84, 'verb', '動詞'),
(85, 'template', 'テンプレート'),
(86, 'valid', '有効'),
(87, 'site', 'サイト'),
(88, 'cost', '原価'),
(89, 'url', 'url'),
(90, 'tag', 'tag'),
(91, 'artist', 'アーティスト'),
(92, 'contract', '契約'),
(93, 'initial', '原価'),
(94, 'num', '数'),
(95, 'Contract', '契約'),
(96, 'StockTake', '棚卸個別情報'),
(97, 'StockTakeReport', '棚卸報告'),
(98, 'matching', '一致'),
(99, 'productname', '製品名'),
(100, 'modelcode', '型番'),
(101, 'user', 'ユーザー'),
(102, 'video', 'ビデオ'),
(103, 'lesson', '授業'),
(104, 'updatedate', '更新日'),
(105, 'createdate', '作成日'),
(107, 'course', 'コース'),
(108, 'Course', 'コース'),
(109, 'Lesson', '授業'),
(110, 'User', 'ユーザ'),
(111, 'Video', 'ビデオ'),
(112, 'Music', '音楽'),
(113, 'Enrollment', '履修'),
(114, 'enrollment', '履修'),
(115, 'node', 'ノード'),
(116, 'Node', 'ノード'),
(117, 'shop', 'ショップ');

-- --------------------------------------------------------

--
-- テーブルの構造 `COMPONEY`
--

CREATE TABLE IF NOT EXISTS `COMPONEY` (
`ID` int(11) NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `RESPONSIBLE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ATTACKLIST` tinyint(4) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `INTRA_USER`
--

CREATE TABLE IF NOT EXISTS `INTRA_USER` (
`ID` int(11) NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ACCOUNT` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `J2EE_STORY`
--

CREATE TABLE IF NOT EXISTS `J2EE_STORY` (
`ID` int(11) NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `STARTDATE` datetime NOT NULL,
  `REQUIREDSTORYTELLERHOUR` int(11) NOT NULL,
  `REQUIREDTEAMHOUR` int(11) NOT NULL,
  `PRICE` int(11) NOT NULL,
  `ENDDATE` datetime NOT NULL,
  `STRUTSCONFIGCONTENT` varchar(20000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ANDROMDA_CORE_JAR_FILE_FK` int(11) DEFAULT NULL,
  `story` varchar(255) NOT NULL,
  `INCOME` int(11) NOT NULL,
  `TOTALCOST` int(11) NOT NULL,
  `PROFIT` int(11) NOT NULL,
  `DEVIDENTFORTEAM` int(11) NOT NULL,
  `TELLERAPP` tinyint(4) NOT NULL,
  `BASECAMPURL` varchar(255) NOT NULL,
  `BASECAMPAPIHASH` varchar(255) NOT NULL,
  `DIFICULTY` int(11) NOT NULL,
  `SALEREQUIRED` varchar(4) NOT NULL,
  `OFFSHORABLE` tinyint(4) NOT NULL,
  `CONSULTINGRATE` tinyint(4) NOT NULL,
  `CONTIUNINGBUSINESS` tinyint(4) NOT NULL,
  `ADVERTISINGRATE` int(11) NOT NULL,
  `PRICE_PER_SENTENCES` int(11) NOT NULL,
  `DISCOUNTPERCENTAGE` int(11) NOT NULL,
  `INTERFACESPECSURL` varchar(255) NOT NULL,
  `JAPANESE` varchar(255) NOT NULL,
  `COVERED` tinyint(4) NOT NULL,
  `ACTIVE` tinyint(4) NOT NULL,
  `CLIENT_FK` int(11) NOT NULL,
  `CONTRIBUTE_FK` int(11) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `J2EE_STORY`
--

INSERT INTO `J2EE_STORY` (`ID`, `NAME`, `STARTDATE`, `REQUIREDSTORYTELLERHOUR`, `REQUIREDTEAMHOUR`, `PRICE`, `ENDDATE`, `STRUTSCONFIGCONTENT`, `ANDROMDA_CORE_JAR_FILE_FK`, `story`, `INCOME`, `TOTALCOST`, `PROFIT`, `DEVIDENTFORTEAM`, `TELLERAPP`, `BASECAMPURL`, `BASECAMPAPIHASH`, `DIFICULTY`, `SALEREQUIRED`, `OFFSHORABLE`, `CONSULTINGRATE`, `CONTIUNINGBUSINESS`, `ADVERTISINGRATE`, `PRICE_PER_SENTENCES`, `DISCOUNTPERCENTAGE`, `INTERFACESPECSURL`, `JAPANESE`, `COVERED`, `ACTIVE`, `CLIENT_FK`, `CONTRIBUTE_FK`) VALUES
(1, 'nodepad', '2015-03-30 00:00:00', 320, 480, 100, '2015-03-30 00:00:00', ' ', 1, 'test', 100, 100, 0, 0, 1, 'http:', 'jfjoffjiof', 100, '1', 1, 1, 1, 50, 5, 5, '5', 'nodepad', 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- テーブルの構造 `JSP`
--

CREATE TABLE IF NOT EXISTS `JSP` (
`ID` int(11) NOT NULL,
  `CODE` varchar(10000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `FILENAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `SENTENCE_FK` int(11) NOT NULL,
  `MODIFIED` tinyint(4) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `JSP`
--

INSERT INTO `JSP` (`ID`, `CODE`, `FILENAME`, `SENTENCE_FK`, `MODIFIED`) VALUES
(1, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n\r\n<%@ taglib uri="/formtag.tld" prefix="formtag" %> \r\n<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> \r\n\r\n\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n\r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n<div class="main">\r\n<span id="title">\r\n	##japanese##編集\r\n</span>\r\n<span id="subform">\r\n		<html:form method="POST" action="/PostNodeVP">\r\n          <html:hidden name="form" property="id"/>\r\n\r\ncontentType<br />\r\n<html:text name="form" property="contentType" /><br />\r\n\r\ncontent<br />\r\n<html:text name="form" property="content" /><br />\r\n\r\nwidth<br />\r\n<html:text name="form" property="width" /><br />\r\n\r\nheight<br />\r\n<html:text name="form" property="height" /><br />\r\n\r\nx<br />\r\n<html:text name="form" property="x" /><br />\r\n\r\ny<br />\r\n<html:text name="form" property="y" /><br />\r\n\r\n\r\n\r\n\r\n          <html:submit value="save"/>\r\n		</html:form>\r\n</span>\r\n</div>\r\n\r\n	</body>\r\n</html:html>\r\n\r\n\r\n', 'PostNodeDetailAsTest.jsp', 4, 0),
(2, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n\r\n<%@ taglib uri="/formtag.tld" prefix="formtag" %> \r\n<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> \r\n\r\n\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n\r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n<div class="main">\r\n<span id="title">\r\n	##japanese##編集\r\n</span>\r\n<span id="subform">\r\n		<html:form method="POST" action="/PostNodeVP">\r\n          <html:hidden name="form" property="id"/>\r\n\r\ncontent<br />\r\n<html:text name="form" property="content" /><br />\r\n\r\n\r\n\r\n\r\n          <html:submit value="save"/>\r\n		</html:form>\r\n</span>\r\n</div>\r\n\r\n	</body>\r\n</html:html>\r\n\r\n\r\n', 'PostNodeDetailForContentOnly.jsp', 5, 0),
(4, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n<%@ taglib uri="/formtag.tld" prefix="formtag" %> \r\n<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> \r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n<div class="main">\r\n\r\n<span class="title">##japanese##s</span>\r\n                    <display:table name="${nodes}" id="row" requestURI="Nodes.do"\r\n                            requestURIcontext="false"\r\n                            export="false" pagesize="30" sort="list">\r\n                        <display:column media="html" sortable="false">\r\n                        <a href="Nodes.do?id=${row.id}">ed</a>\r\n                        <a href="DeleteNode.do?id=${row.id}">del</a>\r\n                        </display:column>\r\n <display:column media="html" sortable="true" title="width">\r\n<nobr>\r\n${row.width}\r\n</nobr>\r\n</display:column>\r\n <display:column media="html" sortable="true" title="height">\r\n<nobr>\r\n${row.height}\r\n</nobr>\r\n</display:column>\r\n <display:column media="html" sortable="true" title="x">\r\n<nobr>\r\n${row.x}\r\n</nobr>\r\n</display:column>\r\n <display:column media="html" sortable="true" title="y">\r\n<nobr>\r\n${row.y}\r\n</nobr>\r\n</display:column>\r\n\r\n                    </display:table>\r\n<a href="Nodes.do?d-16544-e=1&6578706f7274=1&displayexport">\r\nCVS\r\n</a>\r\n<a href="Nodes.do?d-16544-e=2&6578706f7274=1&displayexport">\r\nXLS\r\n</a>\r\n<a href="Nodes.do?d-16544-e=3&6578706f7274=1&displayexport">\r\nXML\r\n</a>\r\n<a href="Nodes.do?d-16544-e=4&6578706f7274=1&displayexport">\r\nPDF\r\n</a>\r\n\r\n\r\n</div>\r\n\r\n<div class="sub">\r\n<span id="title">\r\n	##japanese##編集\r\n</span>\r\n<span id="subform">\r\n\r\n		<form method="POST" action="PostNodeVP.do">\r\n          <html:hidden name="form" property="id"/>\r\n\r\nwidth<br />\r\n<html:text name="form" property="width" /><br />\r\n\r\nheight<br />\r\n<html:text name="form" property="height" /><br />\r\n\r\nx<br />\r\n<html:text name="form" property="x" /><br />\r\n\r\ny<br />\r\n<html:text name="form" property="y" /><br />\r\n\r\n\r\n\r\n          <html:submit value="save" />\r\n		</form>\r\n</span>\r\n                        <a href="NodeDetail.do">新規作成##japanese##</a>\r\n</div>\r\n\r\n\r\n\r\n\r\n\r\n\r\n	</body>\r\n</html:html>\r\n\r\n', 'Nodes.jsp', 7, 0),
(3, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n<%@ taglib uri="/formtag.tld" prefix="formtag" %> \r\n<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> \r\n\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n\r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n<div>\r\nwidth\r\n${node.width}\r\n<br/>\r\nheight\r\n${node.height}\r\n<br/>\r\n\r\n\r\n</div>\r\n\r\n\r\n\r\n	</body>\r\n</html:html>\r\n\r\n\r\n', 'ShowNodeWidthAndHeight.jsp', 6, 0),
(5, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n<%@ page isELIgnored="false" %>\r\n                    <display:table name="${nodes}" id="row" requestURI="Nodes.do"\r\n                            requestURIcontext="false"\r\n                            export="true" pagesize="30" sort="list">\r\n                        <display:column media="xml csv excel pdf" sortable="false" property="id" />\r\n<display:column media="xml csv excel pdf" property="width" title="width"/>\r\n<display:column media="xml csv excel pdf" property="height" title="height"/>\r\n<display:column media="xml csv excel pdf" property="x" title="x"/>\r\n<display:column media="xml csv excel pdf" property="y" title="y"/>\r\n\r\n                    </display:table>\r\n\r\n\r\n', 'DisplayExportsNodes.jsp', 7, 0);

-- --------------------------------------------------------

--
-- テーブルの構造 `JSP_TEMPLATE`
--

CREATE TABLE IF NOT EXISTS `JSP_TEMPLATE` (
`ID` int(11) NOT NULL,
  `TEMPLATE` varchar(10000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `NAMETEMPLATE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `VERB_FK` int(11) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `JSP_TEMPLATE`
--

INSERT INTO `JSP_TEMPLATE` (`ID`, `TEMPLATE`, `NAMETEMPLATE`, `VERB_FK`) VALUES
(1, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n<%@ page isELIgnored="false" %>\r\n\r\n	\r\n	<logic:iterate id="o" name="outputs">\r\n	<div>\r\n	${o.description};\r\n	</div>\r\n	<hr>\r\n	</logic:iterate>\r\n', 'RSSBlock.jsp', 1),
(2, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n<div class="main">\r\n<span class="title">##modelobj##s</span>\r\n                    <display:table name="${##modelobj##s}" id="row" requestURI="##modelclass##s.do"\r\n                            requestURIcontext="false"\r\n                            export="true" pagesize="15" sort="list">\r\n                        <display:column media="html" sortable="false">\r\n                        <a href="##modelclass##Detail.do?id=${row.id}">ed</a>\r\n                        <a href="Delete##modelclass##.do?id=${row.id}">del</a>\r\n                        </display:column>\r\n##displaycontent##\r\n                    </display:table>\r\n\r\n\r\n                        <a href="##modelclass##Detail.do">new ##modelclass##</a>\r\n</div>\r\n\r\n\r\n<div class="sub">\r\n\r\n		<html:form method="POST" action="/##modelclass##VP">\r\n          <html:hidden name="##modelobj##" property="id"/>\r\n\r\n##formcontent##\r\n\r\n          <html:submit />\r\n		</html:form>\r\n</div>\r\n\r\n\r\n\r\n\r\n\r\n\r\n	</body>\r\n</html:html>\r\n\r\n', '##modelclass##s.jsp', 2),
(3, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n\r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n\r\n<div class="main">\r\n<span class="title">##modelclass## 編集</span>\r\n		<html:form method="POST" action="/##modelclass##VP">\r\n          <html:hidden name="##modelobj##" property="id"/>\r\n\r\n##formcontent##\r\n\r\n          <html:submit />\r\n		</html:form>\r\n</div>\r\n\r\n<div class="sub">\r\n\r\n\r\n</div>\r\n	</body>\r\n</html:html>\r\n\r\n\r\n', '##modelclass##Detail.jsp', 2),
(4, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n<div class="main">\r\n\r\n<form action="SetSelectionOf##modelclass####attr##.do" method="post" name="form">\r\n<a href="${from}.do?pagesize=20">20件</a>\r\n<a href="${from}.do?pagesize=50">50件</a>\r\n<a href="${from}.do?pagesize=100">100件</a>\r\n<a href="${from}.do?pagesize=200">200件</a>\r\n<a href="${from}.do?pagesize=300">300件</a>\r\n<a href="${from}.do?pagesize=500">500件</a>\r\n<a href="#" onclick="selectall(form);">select all</a>\r\n<span class="title">##modelobj##s</span>\r\n                    <display:table name="${##modelobj##s}" id="row" requestURI="##modelclass##s.do"\r\n                            requestURIcontext="false"\r\n                            export="true" pagesize="15" sort="list">\r\n                        <display:column media="html" sortable="false">\r\n                        <a href="##modelclass##Detail.do?id=${row.id}">ed</a>\r\n                        <a href="Delete##modelclass##.do?id=${row.id}">del</a>\r\n                        </display:column>\r\n##displaycontent##\r\n                    </display:table>\r\n\r\n\r\n                        <a href="##modelclass##Detail.do">new ##modelclass##</a>\r\n<html:submit />\r\n</form>\r\n</div>\r\n\r\n\r\n<div class="sub">\r\n\r\n		<html:form method="POST" action="/##modelclass##VP">\r\n          <html:hidden name="##modelobj##" property="id"/>\r\n\r\n##formcontent##\r\n\r\n          <html:submit />\r\n		</html:form>\r\n</div>\r\n\r\n\r\n\r\n\r\n\r\n\r\n	</body>\r\n</html:html>\r\n\r\n', '##modelclass##s.jsp', 6),
(5, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n\r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n\r\n<div class="main">\r\n<span class="title">##modelclass## 編集</span>\r\n		<html:form method="POST" action="/##modelclass##VP">\r\n          <html:hidden name="##modelobj##" property="id"/>\r\n\r\n##formcontent##\r\n\r\n          <html:submit value="保存"/>\r\n		</html:form>\r\n</div>\r\n\r\n<div class="sub">\r\n\r\n\r\n</div>\r\n	</body>\r\n</html:html>\r\n\r\n\r\n', '##modelclass##Detail.jsp', 6),
(6, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n\r\n<%@ taglib uri="/formtag.tld" prefix="formtag" %> \r\n<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> \r\n\r\n\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n\r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n<div class="main">\r\n<span id="title">\r\n	##japanese##編集\r\n</span>\r\n<span id="subform">\r\n		<html:form method="POST" action="/Post##modelclass##VP">\r\n          <html:hidden name="form" property="id"/>\r\n\r\n##formcontent##\r\n\r\n\r\n          <html:submit value="save"/>\r\n		</html:form>\r\n</span>\r\n</div>\r\n\r\n	</body>\r\n</html:html>\r\n\r\n\r\n', 'Post##modelclass##Detail.jsp', 8),
(7, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n<%@ taglib uri="/formtag.tld" prefix="formtag" %> \r\n<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> \r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n<div class="main">\r\n\r\n<span class="title">##japanese##s</span>\r\n                    <display:table name="${##modelobj##s}" id="row" requestURI="##modelclass##s.do"\r\n                            requestURIcontext="false"\r\n                            export="false" pagesize="30" sort="list">\r\n                        <display:column media="html" sortable="false">\r\n                        <a href="##modelclass##s.do?id=${row.id}">ed</a>\r\n                        <a href="Delete##modelclass##.do?id=${row.id}">del</a>\r\n                        </display:column>\r\n##displaycontent##\r\n                    </display:table>\r\n<a href="##modelclass##s.do?d-16544-e=1&6578706f7274=1&displayexport">\r\nCVS\r\n</a>\r\n<a href="##modelclass##s.do?d-16544-e=2&6578706f7274=1&displayexport">\r\nXLS\r\n</a>\r\n<a href="##modelclass##s.do?d-16544-e=3&6578706f7274=1&displayexport">\r\nXML\r\n</a>\r\n<a href="##modelclass##s.do?d-16544-e=4&6578706f7274=1&displayexport">\r\nPDF\r\n</a>\r\n\r\n\r\n</div>\r\n\r\n<div class="sub">\r\n<span id="title">\r\n	##japanese##編集\r\n</span>\r\n<span id="subform">\r\n\r\n		<form method="POST" action="Post##modelclass##VP.do">\r\n          <html:hidden name="form" property="id"/>\r\n\r\n##formcontent##\r\n\r\n          <html:submit value="save" />\r\n		</form>\r\n</span>\r\n                        <a href="##modelclass##Detail.do">新規作成##japanese##</a>\r\n</div>\r\n\r\n\r\n\r\n\r\n\r\n\r\n	</body>\r\n</html:html>\r\n\r\n', '##modelclass##s.jsp', 9),
(8, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n<%@ taglib uri="/formtag.tld" prefix="formtag" %> \r\n<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> \r\n\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n\r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n<div>\r\n##showattrs##\r\n\r\n</div>\r\n\r\n\r\n\r\n	</body>\r\n</html:html>\r\n\r\n\r\n', 'Show##modelclass##.jsp', 10),
(9, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n\r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n\r\n			<form method="POST" action="##modelclass##FormFileUploadAddingTo##addingtoclass##.do" enctype="multipart/form-data">\r\n		  		<input type="file" name="formFile" />\r\n				<input type="hidden" name="##addingtoobj##" value="${##addingtoobj##.id}" />\r\n				<html:submit value="追加"/>\r\n			</form>\r\n\r\n\r\n\r\n	</body>\r\n</html:html>\r\n\r\n\r\n', '##modelclass##FormFileUploadAddingTo##addingtoclass##.jsp', 11),
(10, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n\r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n\r\n			<form method="POST" action="##modelclass##VP.do" enctype="multipart/form-data">\r\n				<html:file property="file" name="formFile"></html:file>\r\n				<input type="hidden" name="id" value="${##modelobj##.id}" />\r\n				<input type="hidden" name="##addingtoobj##" value="${##addingtoobj##.id}" />\r\n				<html:submit value="追加"/>\r\n			</form>\r\n\r\n\r\n\r\n	</body>\r\n</html:html>\r\n\r\n\r\n', '##modelclass##FormFileUploadAddingTo##addingtoclass##.jsp', 7),
(12, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n<%@ page isELIgnored="false" %>\r\n                    <display:table name="${##modelobj##s}" id="row" requestURI="##modelclass##s.do"\r\n                            requestURIcontext="false"\r\n                            export="true" pagesize="30" sort="list">\r\n                        <display:column media="xml csv excel pdf" sortable="false" property="id" />\r\n##displayexportcontent##\r\n                    </display:table>\r\n\r\n\r\n', 'DisplayExports##modelclass##s.jsp', 9),
(11, '                                        <select name="##modelobj##">\r\n                                            <option value=""></option>\r\n                                            <c:forEach var="valueLabel" items="${##modelclass##s}">\r\n                                                <c:choose>\r\n                                                    <c:when test="${valueLabel.id eq ##addingclass##.##modelobj##.id}">\r\n                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>\r\n                                                    </c:when>\r\n                                                    <c:otherwise>\r\n                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>\r\n                                                    </c:otherwise>\r\n                                                </c:choose>\r\n                                            </c:forEach>\r\n                                        </select>\r\n', '##modelclass##SelectSnip.jsp', 6),
(13, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n<%@ page isELIgnored="false" %>\r\n<html:html>\r\n<head>\r\n<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">\r\n<title>参加お申込フォーム　｜　ログイン</title>\r\n<link href="css/import.css" rel="stylesheet" type="text/css">\r\n</head>\r\n\r\n<body id="toppage">\r\n                <div id="log_in_form">\r\n\r\n<c:if test="${!empty message}">\r\n<font color="red">\r\n<!-- ${message} -->\r\n${message}\r\n</font><br>\r\n</c:if>\r\n			        <html:form action="/Login.do" method="post">\r\n					<table width="100%" border="0" cellspacing="5" cellpadding="0">\r\n					  <tr>\r\n					    <td><p class="summary">account</p></td>\r\n					  </tr>\r\n					  <tr>\r\n					    <td><input name="account" type="text" size="45"></td>\r\n					  </tr>\r\n					  <tr>\r\n					    <td><p class="summary">パスワード</p></td>\r\n					  </tr>\r\n					  <tr>\r\n					    <td><input name="password" type="password" size="45"></td>\r\n					  </tr>\r\n					  <tr>\r\n					    <td><img src="img/spacer.gif" alt="" width="1" height="20"></td>\r\n					  </tr>\r\n					  <tr>\r\n					    <td><p align="center">\r\n					        <input type="submit" name="Submit" value="　ログイン　">\r\n							<img src="img/spacer.gif" alt="" width="15" height="1">\r\n							<input name="リセット" type="reset" value="　リセット　">\r\n					        </p>	</td>\r\n					  </tr>\r\n					</table>\r\n					</html:form>\r\n			    </div>\r\n\r\n</div>\r\n\r\n</body>\r\n</html:html>\r\n\r\n\r\n', 'Login.jsp', 12),
(14, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n<%@ taglib uri="/formtag.tld" prefix="formtag" %> \r\n<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> \r\n<%@ page isELIgnored="false" %>\r\n<##modelobj##s>\r\n    <logic:iterate id="model" name="##modelobj##s">\r\n       <##modelobj##>\r\n         ##displayxmlcontent##\r\n       </##modelobj##>\r\n    </logic:iterate>\r\n</##modelobj##s>\r\n', 'DisplayXmlOf##modelclass##.jsp', 17),
(15, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n\r\n<%@ taglib uri="/formtag.tld" prefix="formtag" %> \r\n<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> \r\n\r\n\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n\r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<html:html>\r\n<tiles:insert page="/h.jsp"/>\r\n\r\n             <font style="font-size:${param.fontsize}px;">\r\n                  <bean:write name="text" />\r\n              </font>\r\n\r\n	</body>\r\n</html:html>\r\n\r\n\r\n\r\n\r\n', 'Museigen##modelclass##.jsp', 18),
(16, '<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\r\n\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>\r\n<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>\r\n<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>\r\n<%@ taglib uri="/tags/struts-logic" prefix="logic" %>\r\n<%@ taglib uri="/tags/struts-html" prefix="html" %>\r\n<%@ taglib uri="/tags/struts-bean" prefix="bean" %>\r\n<%@ taglib uri="/formtag.tld" prefix="formtag" %> \r\n<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> \r\n\r\n<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>\r\n\r\n\r\n<%@ page isELIgnored="false" %>\r\n\r\n<##modelobj##>\r\n   ##displayxmlcontent##\r\n</##modelobj##>\r\n', 'Show##modelclass##Xml.jsp', 17);

-- --------------------------------------------------------

--
-- テーブルの構造 `MANUAL_STEP`
--

CREATE TABLE IF NOT EXISTS `MANUAL_STEP` (
`ID` int(11) NOT NULL,
  `URL` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `DESCRIPTION` varchar(10000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ORDERNUM` int(11) NOT NULL,
  `OUT_OF_PATTEN_SENTENCE_FK` int(11) DEFAULT NULL,
  `SENTENCE_FK` int(11) DEFAULT NULL,
  `J2EE_STORY_FK` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `NOUN`
--

CREATE TABLE IF NOT EXISTS `NOUN` (
`ID` int(11) NOT NULL,
  `VALID` tinyint(4) NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `JAPANESE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `J2EE_STORY_FK` int(11) DEFAULT NULL
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `NOUN`
--

INSERT INTO `NOUN` (`ID`, `VALID`, `NAME`, `JAPANESE`, `J2EE_STORY_FK`) VALUES
(1, 1, 'Node', '', 1),
(2, 1, 'NodeInterface', '', 1),
(3, 1, 'NodeUse', '', 1),
(4, 1, 'LinkUse', '', 1),
(5, 1, 'User', '', 1),
(6, 1, 'NodeUser', '1', NULL),
(7, 1, 'Roi', '', 1),
(8, 1, 'Link', '1', NULL),
(9, 1, 'NodeField', '1', NULL),
(10, 1, 'Link', '', 1),
(11, 1, 'NodeField', '', 1),
(12, 1, 'Graph', '', 1),
(13, 1, 'NodeUser', '', 1);

-- --------------------------------------------------------

--
-- テーブルの構造 `NOUN_CLAUSE`
--

CREATE TABLE IF NOT EXISTS `NOUN_CLAUSE` (
`ID` int(11) NOT NULL,
  `CODE` varchar(10000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `NOUN_CLAUSE`
--

INSERT INTO `NOUN_CLAUSE` (`ID`, `CODE`) VALUES
(1, ''),
(2, ''),
(3, ''),
(4, ''),
(5, ''),
(6, ''),
(7, ''),
(8, ''),
(9, ''),
(10, ''),
(11, ''),
(12, ''),
(13, ''),
(14, ''),
(15, ''),
(16, ''),
(17, ''),
(18, ''),
(19, ''),
(20, ''),
(21, ''),
(22, ''),
(23, ''),
(24, ''),
(25, ''),
(26, '');

-- --------------------------------------------------------

--
-- テーブルの構造 `NOUN_USE`
--

CREATE TABLE IF NOT EXISTS `NOUN_USE` (
`ID` int(11) NOT NULL,
  `MUTIPLE` tinyint(4) NOT NULL,
  `OFORDER` int(11) NOT NULL,
  `NOUN_FK` int(11) NOT NULL,
  `NOUN_CLAUSE_FK` int(11) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `NOUN_USE`
--

INSERT INTO `NOUN_USE` (`ID`, `MUTIPLE`, `OFORDER`, `NOUN_FK`, `NOUN_CLAUSE_FK`) VALUES
(1, 1, 1, 1, 2),
(2, 1, 1, 2, 3),
(3, 0, 1, 1, 4),
(4, 0, 1, 1, 5),
(5, 0, 1, 1, 6),
(6, 0, 1, 1, 7),
(7, 0, 1, 1, 8),
(8, 1, 1, 3, 9),
(9, 1, 1, 4, 10),
(10, 1, 1, 5, 11),
(11, 1, 1, 6, 12),
(12, 1, 1, 7, 13),
(13, 1, 1, 8, 14),
(14, 1, 1, 9, 15),
(15, 1, 1, 10, 16),
(16, 1, 1, 11, 17),
(17, 1, 1, 12, 18),
(18, 1, 1, 13, 19),
(19, 0, 1, 11, 20),
(20, 0, 1, 10, 21),
(21, 0, 1, 5, 22),
(22, 0, 1, 4, 23),
(23, 0, 1, 13, 24),
(24, 0, 1, 4, 25),
(25, 0, 1, 13, 26);

-- --------------------------------------------------------

--
-- テーブルの構造 `OUT_OF_PATTEN_SENTENCE`
--

CREATE TABLE IF NOT EXISTS `OUT_OF_PATTEN_SENTENCE` (
`ID` int(11) NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ESTIMATEDTIME` int(11) NOT NULL,
  `J2EE_STORY_FK` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `POST_TEMPLATE`
--

CREATE TABLE IF NOT EXISTS `POST_TEMPLATE` (
`ID` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `SENTENCE`
--

CREATE TABLE IF NOT EXISTS `SENTENCE` (
`ID` int(11) NOT NULL,
  `STRUTS_CONFIG_CODE` varchar(10000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `VALID` tinyint(4) NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `VERB_FK` int(11) NOT NULL,
  `SECOUNTOBJECTIVE_FK` int(11) DEFAULT NULL,
  `FIRSTOBJECTIVE_FK` int(11) NOT NULL,
  `J2EE_STORY_FK` int(11) DEFAULT NULL,
  `JAPANESE` varchar(255) NOT NULL,
  `MAINTEST_FK` int(11) DEFAULT NULL,
  `MODIFIED` tinyint(4) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `SENTENCE`
--

INSERT INTO `SENTENCE` (`ID`, `STRUTS_CONFIG_CODE`, `VALID`, `NAME`, `VERB_FK`, `SECOUNTOBJECTIVE_FK`, `FIRSTOBJECTIVE_FK`, `J2EE_STORY_FK`, `JAPANESE`, `MAINTEST_FK`, `MODIFIED`) VALUES
(1, '', 0, '', 6, NULL, 2, 1, '', NULL, 0),
(2, '', 0, '', 6, NULL, 3, 1, '', NULL, 0),
(3, '	<action path="/AbstractConverter.java" type="net.nodepad.web.app.AbstractConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeResource.java" type="net.nodepad.web.app.NodeResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeConverter.java" type="net.nodepad.web.app.NodeConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeDto.java" type="net.nodepad.web.app.NodeDto.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeEntity.java" type="net.nodepad.web.app.NodeEntity.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeRepository.java" type="net.nodepad.web.app.NodeRepository.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeService.java" type="net.nodepad.web.app.NodeService.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n', 0, '', 20, NULL, 4, 1, '', NULL, 0),
(4, '	<action path="/PostNodeVPAsTest" name="NodeForm" type="net.nodepad.web.app.PostNodeVPAsTestAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/PostNodeDetailAsTest" type="net.nodepad.web.app.PostNodeDetailAsTestAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n', 0, 'AsTest', 8, NULL, 5, 1, '', NULL, 0),
(5, '	<action path="/PostNodeVPForContentOnly" name="NodeForm" type="net.nodepad.web.app.PostNodeVPForContentOnlyAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/PostNodeDetailForContentOnly" type="net.nodepad.web.app.PostNodeDetailForContentOnlyAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n', 0, 'ForContentOnly', 8, NULL, 6, 1, '', NULL, 0),
(6, '	<action path="/ShowNodeWidthAndHeight" type="net.nodepad.web.app.ShowNodeWidthAndHeightAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n', 0, 'WidthAndHeight', 10, NULL, 7, 1, '', NULL, 0),
(7, '	<action path="/Nodes" type="net.nodepad.web.app.NodesAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n', 0, '', 9, NULL, 8, 1, '', NULL, 0),
(8, '', 0, '', 6, NULL, 9, 1, '', NULL, 0),
(9, '', 0, '', 6, NULL, 10, 1, '', NULL, 0),
(10, '', 0, '', 6, NULL, 11, 1, '', NULL, 0),
(11, '', 0, '', 6, NULL, 12, NULL, '', NULL, 0),
(12, '', 0, '', 6, NULL, 13, 1, '', NULL, 0),
(13, '', 0, '', 6, NULL, 14, NULL, '', NULL, 0),
(14, '', 0, '', 6, NULL, 15, NULL, '', NULL, 0),
(15, '', 0, '', 6, NULL, 16, 1, '', NULL, 0),
(16, '', 0, '', 6, NULL, 17, 1, '', NULL, 0),
(17, '', 0, '', 6, NULL, 18, 1, '', NULL, 0),
(18, '', 0, '', 6, NULL, 19, 1, '', NULL, 0),
(19, '	<action path="/NodeFieldResource.java" type="net.nodepad.web.app.NodeFieldResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeFieldConverter" type="net.nodepad.web.app.NodeFieldConverterAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeFieldDto" type="net.nodepad.web.app.NodeFieldDtoAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeFieldEntity" type="net.nodepad.web.app.NodeFieldEntityAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeFieldRepository" type="net.nodepad.web.app.NodeFieldRepositoryAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeFieldService" type="net.nodepad.web.app.NodeFieldServiceAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeFieldResource.java.java" type="net.nodepad.web.app.NodeFieldResource.java.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeFieldConverter.java" type="net.nodepad.web.app.NodeFieldConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/AbstractConverter.java" type="net.nodepad.web.app.AbstractConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeFieldDto.java" type="net.nodepad.web.app.NodeFieldDto.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeFieldEntity.java" type="net.nodepad.web.app.NodeFieldEntity.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeFieldRepository.java" type="net.nodepad.web.app.NodeFieldRepository.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeFieldService.java" type="net.nodepad.web.app.NodeFieldService.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeFieldResource.java" type="net.nodepad.web.app.NodeFieldResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n', 0, '', 20, NULL, 20, 1, '', NULL, 0),
(20, '	<action path="/LinkResource.java" type="net.nodepad.web.app.LinkResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkResource.java" type="net.nodepad.web.app.LinkResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkConverter" type="net.nodepad.web.app.LinkConverterAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkDto" type="net.nodepad.web.app.LinkDtoAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkEntity" type="net.nodepad.web.app.LinkEntityAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkRepository" type="net.nodepad.web.app.LinkRepositoryAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkService" type="net.nodepad.web.app.LinkServiceAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/AbstractConverter.java" type="net.nodepad.web.app.AbstractConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkResource.java.java" type="net.nodepad.web.app.LinkResource.java.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkConverter.java" type="net.nodepad.web.app.LinkConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkDto.java" type="net.nodepad.web.app.LinkDto.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkEntity.java" type="net.nodepad.web.app.LinkEntity.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkRepository.java" type="net.nodepad.web.app.LinkRepository.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkService.java" type="net.nodepad.web.app.LinkService.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n', 0, '', 20, NULL, 21, 1, '', NULL, 0),
(21, '	<action path="/UserResource.java" type="net.nodepad.web.app.UserResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/UserConverter" type="net.nodepad.web.app.UserConverterAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/UserDto" type="net.nodepad.web.app.UserDtoAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/UserEntity" type="net.nodepad.web.app.UserEntityAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/UserRepository" type="net.nodepad.web.app.UserRepositoryAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/UserService" type="net.nodepad.web.app.UserServiceAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/AbstractConverter.java" type="net.nodepad.web.app.AbstractConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/UserResource.java.java" type="net.nodepad.web.app.UserResource.java.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/UserConverter.java" type="net.nodepad.web.app.UserConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/UserDto.java" type="net.nodepad.web.app.UserDto.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/UserEntity.java" type="net.nodepad.web.app.UserEntity.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/UserRepository.java" type="net.nodepad.web.app.UserRepository.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/UserService.java" type="net.nodepad.web.app.UserService.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/UserResource.java" type="net.nodepad.web.app.UserResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n', 0, '', 20, NULL, 22, 1, '', NULL, 0),
(22, '	<action path="/LinkUseResource.java" type="net.nodepad.web.app.LinkUseResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseConverter" type="net.nodepad.web.app.LinkUseConverterAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseDto" type="net.nodepad.web.app.LinkUseDtoAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseEntity" type="net.nodepad.web.app.LinkUseEntityAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseRepository" type="net.nodepad.web.app.LinkUseRepositoryAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseService" type="net.nodepad.web.app.LinkUseServiceAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/AbstractConverter.java" type="net.nodepad.web.app.AbstractConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseResource.java.java" type="net.nodepad.web.app.LinkUseResource.java.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseConverter.java" type="net.nodepad.web.app.LinkUseConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseDto.java" type="net.nodepad.web.app.LinkUseDto.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseEntity.java" type="net.nodepad.web.app.LinkUseEntity.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseRepository.java" type="net.nodepad.web.app.LinkUseRepository.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseService.java" type="net.nodepad.web.app.LinkUseService.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseResource.java" type="net.nodepad.web.app.LinkUseResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n', 0, '', 20, NULL, 23, 1, '', NULL, 0),
(23, '	<action path="/AbstractConverter" type="net.nodepad.web.app.AbstractConverterAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserResource.java" type="net.nodepad.web.app.NodeUserResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserConverter" type="net.nodepad.web.app.NodeUserConverterAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserDto" type="net.nodepad.web.app.NodeUserDtoAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserEntity" type="net.nodepad.web.app.NodeUserEntityAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserRepository" type="net.nodepad.web.app.NodeUserRepositoryAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserService" type="net.nodepad.web.app.NodeUserServiceAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/AbstractConverter.java" type="net.nodepad.web.app.AbstractConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserResource.java.java" type="net.nodepad.web.app.NodeUserResource.java.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserConverter.java" type="net.nodepad.web.app.NodeUserConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserDto.java" type="net.nodepad.web.app.NodeUserDto.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserEntity.java" type="net.nodepad.web.app.NodeUserEntity.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserRepository.java" type="net.nodepad.web.app.NodeUserRepository.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserService.java" type="net.nodepad.web.app.NodeUserService.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserResource.java" type="net.nodepad.web.app.NodeUserResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n', 0, '', 20, NULL, 24, 1, '', NULL, 0),
(24, '	<action path="/AbstractConverter.java" type="net.nodepad.web.app.AbstractConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseConverter.java" type="net.nodepad.web.app.LinkUseConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseDto.java" type="net.nodepad.web.app.LinkUseDto.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseEntity.java" type="net.nodepad.web.app.LinkUseEntity.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseRepository.java" type="net.nodepad.web.app.LinkUseRepository.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseService.java" type="net.nodepad.web.app.LinkUseService.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/LinkUseResource.java" type="net.nodepad.web.app.LinkUseResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n', 0, '', 20, NULL, 25, 1, '', NULL, 0),
(25, '	<action path="/AbstractConverter.java" type="net.nodepad.web.app.AbstractConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserConverter.java" type="net.nodepad.web.app.NodeUserConverter.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserDto.java" type="net.nodepad.web.app.NodeUserDto.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserEntity.java" type="net.nodepad.web.app.NodeUserEntity.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserRepository.java" type="net.nodepad.web.app.NodeUserRepository.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserService.java" type="net.nodepad.web.app.NodeUserService.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n	<action path="/NodeUserResource.java" type="net.nodepad.web.app.NodeUserResource.javaAction">\r\n  <forward name="success" path="" />\r\n</action>\r\n', 0, '', 20, NULL, 26, 1, '', NULL, 0);

-- --------------------------------------------------------

--
-- テーブルの構造 `STATIC_DATA`
--

CREATE TABLE IF NOT EXISTS `STATIC_DATA` (
`ID` int(11) NOT NULL,
  `DOCUMENT_ARRIVED_REPORT_TEMPLA` varchar(10000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `DOCUMENT_REQUEST_TEMPLATE` varchar(10000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `INFORSSURL` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `REPORTMAIL` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `CRTMAX` int(11) NOT NULL,
  `ARPMAX` int(11) NOT NULL,
  `ECLIPSEROOT` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `STORYTELLERBYPROJECTTEAMRATE` float NOT NULL,
  `PROJECTBYSTORYTELLERRATE` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `STORYTELLER`
--

CREATE TABLE IF NOT EXISTS `STORYTELLER` (
`ID` int(11) NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `MAIL` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `STORYTELLER_PAGE`
--

CREATE TABLE IF NOT EXISTS `STORYTELLER_PAGE` (
`ID` int(11) NOT NULL,
  `TITLE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `JSP_FK` int(11) DEFAULT NULL,
  `STRUTS_ACTION_FK` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `STRUTS_ACTION`
--

CREATE TABLE IF NOT EXISTS `STRUTS_ACTION` (
`ID` int(11) NOT NULL,
  `CODE` varchar(10000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `FILENAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `SENTENCE_FK` int(11) NOT NULL,
  `TARGETEEJSP_FK` int(11) DEFAULT NULL,
  `TARGETEEACTION_FK` int(11) DEFAULT NULL
) ENGINE=MyISAM AUTO_INCREMENT=83 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `STRUTS_ACTION`
--

INSERT INTO `STRUTS_ACTION` (`ID`, `CODE`, `FILENAME`, `SENTENCE_FK`, `TARGETEEJSP_FK`, `TARGETEEACTION_FK`) VALUES
(81, 'package com.theuniversalgraph.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport com.theuniversalgraph.api.rest.dto.LinkDto;\r\nimport com.theuniversalgraph.api.rest.service.LinkService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/Links")\r\n@Api(value = "Link API")\r\npublic class LinkResource {\r\n\r\n    @Autowired\r\n    private LinkService linkService;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<LinkDto> getAllLinks() {\r\n        return linkService.getAllLinks();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public LinkDto getLink(@PathVariable final String id) {\r\n        return linkService.getLink(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<LinkDto> addLink(@RequestBody final LinkDto link) {\r\n        LinkDto createdLink = linkService.createLink(link);\r\n        return new ResponseEntity<>(createdLink, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteLink(@PathVariable final String id) {\r\n        linkService.deleteLink(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<LinkDto> updateLink(@PathVariable final String id, @RequestBody final LinkDto link) {\r\n        LinkDto createdLink = linkService.updateLink(id, link);\r\n        return new ResponseEntity<>(createdLink, HttpStatus.OK);\r\n    }\r\n}\r\n', 'LinkResource.java', 20, NULL, NULL),
(3, 'package net.nodepad.web.app;\r\n\r\nimport net.nodepad.model.*;\r\nimport net.nodepad.beans.*;\r\n\r\nimport java.io.File;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.enclosing.util.StringFullfiller;\r\nimport net.enclosing.util.HTTPGetRedirection;\r\nimport net.enclosing.util.HibernateSession;\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.commons.lang.StringUtils;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\n\r\n\r\npublic class PostNodeVPAsTestAction extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		Node node = new NodeImpl();\r\n		NodeForm nodeform = (NodeForm) form;\r\n\r\n                String error = "";\r\n\r\n\r\n                \r\n		\r\n		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());\r\n		if(nodeform.getId() == null || nodeform.getId().intValue() == 0){\r\n			node.setId(null);\r\n			nodeform.setId(null);\r\n		}else{\r\n			node.setId(nodeform.getId());\r\n			Criteria criteria = session.createCriteria(Node.class);\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));\r\n			node = (Node) criteria.uniqueResult();\r\n\r\n		}\r\n                		node.setContentType(nodeform.getContentType());\r\n		node.setContent(nodeform.getContent());\r\n		node.setWidth(nodeform.getWidth());\r\n		node.setHeight(nodeform.getHeight());\r\n		node.setX(nodeform.getX());\r\n		node.setY(nodeform.getY());\r\n\r\n\r\n		\r\n		StringFullfiller.fullfil(node);\r\n                \r\n\r\n		Transaction transaction = session.beginTransaction();\r\n		session.saveOrUpdate(node);\r\n		transaction.commit();\r\n		session.flush();\r\nif(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){\r\n		new HTTPGetRedirection(req, res, "PostNodeDetail.do", node.getId().toString());\r\n\r\n}\r\n		\r\n		new HTTPGetRedirection(req, res, "Nodes.do", node.getId().toString());\r\n		return null;\r\n\r\n		\r\n	}\r\n	\r\n	\r\n}', 'PostNodeVPAsTestAction.java', 4, NULL, NULL),
(4, 'package net.nodepad.web.app;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.nodepad.model.*;\r\nimport net.nodepad.model.crud.*;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\nimport net.storyteller.desktop.CopyProperties;\r\n\r\n\r\npublic class PostNodeDetailAsTestAction extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		Node node = new NodeImpl();\r\n		NodeForm nodeform = new NodeForm();\r\n		Criteria criteria = session.createCriteria(Node.class);\r\n\r\n		if (req.getAttribute("form")== null && req.getParameter("id")!=null){\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			node = (Node) criteria.uniqueResult();\r\n			new CopyProperties(node,nodeform);\r\n		} else if(req.getAttribute("form")!=null){\r\n                        nodeform = (NodeForm)req.getAttribute("form");\r\n			criteria.add(Restrictions.idEq(nodeform.getId()));\r\n			node = (Node) criteria.uniqueResult();\r\n		}\r\n		\r\n\r\n		req.setAttribute("model",node);\r\n		req.setAttribute("form",nodeform);\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', 'PostNodeDetailAsTestAction.java', 4, NULL, NULL),
(5, 'package net.nodepad.web.app;\r\n\r\nimport net.nodepad.model.*;\r\nimport net.nodepad.beans.*;\r\n\r\nimport java.io.File;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.enclosing.util.StringFullfiller;\r\nimport net.enclosing.util.HTTPGetRedirection;\r\nimport net.enclosing.util.HibernateSession;\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.commons.lang.StringUtils;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\n\r\n\r\npublic class PostNodeVPForContentOnlyAction extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		Node node = new NodeImpl();\r\n		NodeForm nodeform = (NodeForm) form;\r\n\r\n                String error = "";\r\nif(StringUtils.isNotBlank(error)){\r\n	req.getSession().setAttribute("error",error);\r\n	req.setAttribute("form",nodeform);\r\n	return mapping.findForward("error");\r\n}\r\n\r\n\r\n                \r\n		\r\n		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());\r\n		if(nodeform.getId() == null || nodeform.getId().intValue() == 0){\r\n			node.setId(null);\r\n			nodeform.setId(null);\r\n		}else{\r\n			node.setId(nodeform.getId());\r\n			Criteria criteria = session.createCriteria(Node.class);\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));\r\n			node = (Node) criteria.uniqueResult();\r\n\r\n		}\r\n                		node.setContent(nodeform.getContent());\r\n\r\n\r\n		\r\n		StringFullfiller.fullfil(node);\r\n                \r\n\r\n		Transaction transaction = session.beginTransaction();\r\n		session.saveOrUpdate(node);\r\n		transaction.commit();\r\n		session.flush();\r\nif(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){\r\n		new HTTPGetRedirection(req, res, "PostNodeDetail.do", node.getId().toString());\r\n\r\n}\r\n		\r\n		new HTTPGetRedirection(req, res, "Nodes.do", node.getId().toString());\r\n		return null;\r\n\r\n		\r\n	}\r\n	\r\n	\r\n}', 'PostNodeVPForContentOnlyAction.java', 5, NULL, NULL),
(6, 'package net.nodepad.web.app;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.nodepad.model.*;\r\nimport net.nodepad.model.crud.*;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\nimport net.storyteller.desktop.CopyProperties;\r\n\r\n\r\npublic class PostNodeDetailForContentOnlyAction extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		Node node = new NodeImpl();\r\n		NodeForm nodeform = new NodeForm();\r\n		Criteria criteria = session.createCriteria(Node.class);\r\n\r\n		if (req.getAttribute("form")== null && req.getParameter("id")!=null){\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			node = (Node) criteria.uniqueResult();\r\n			new CopyProperties(node,nodeform);\r\n		} else if(req.getAttribute("form")!=null){\r\n                        nodeform = (NodeForm)req.getAttribute("form");\r\n			criteria.add(Restrictions.idEq(nodeform.getId()));\r\n			node = (Node) criteria.uniqueResult();\r\n		}\r\n		\r\n\r\n		req.setAttribute("model",node);\r\n		req.setAttribute("form",nodeform);\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', 'PostNodeDetailForContentOnlyAction.java', 5, NULL, NULL),
(7, 'package net.nodepad.web.app;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.nodepad.model.*;\r\nimport net.nodepad.model.crud.*;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\n\r\npublic class ShowNodeWidthAndHeightAction extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		Node node = new NodeImpl();\r\n		Criteria criteria = session.createCriteria(Node.class);\r\n\r\n		if (req.getParameter("id") != null\r\n				&& !req.getParameter("id").equals("")) {\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			node = (Node) criteria.uniqueResult();\r\n\r\n		} else if (req.getAttribute("id") != null\r\n				&& !req.getAttribute("id").equals("")) {\r\n			criteria.add(Restrictions.idEq(req.getAttribute("id")));\r\n			node = (Node) criteria.uniqueResult();\r\n		}\r\n\r\n		req.setAttribute("node",node);\r\n		\r\n		\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', 'ShowNodeWidthAndHeightAction.java', 6, NULL, NULL),
(8, 'package net.nodepad.web.app;\r\n\r\nimport net.nodepad.model.*;\r\nimport net.nodepad.model.crud.*;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport java.util.Iterator;\r\nimport java.util.Vector;\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\n\r\nimport net.enclosing.util.HibernateSession;\r\nimport net.storyteller.desktop.CopyProperties;\r\n\r\n\r\npublic class NodesAction extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n\r\n\r\n\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n                Vector vector = new Vector();\r\n		Criteria criteria = session.createCriteria(Node.class);\r\n		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {\r\n			Node node = (Node) iter.next();\r\n			vector.add(node);\r\n		}\r\n		Node node = new NodeImpl();\r\n		NodeForm nodeform = new NodeForm();\r\n		criteria = session.createCriteria(Node.class);\r\n\r\n\r\n		if (req.getAttribute("form")== null && req.getParameter("id")!=null){\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			node = (Node) criteria.uniqueResult();\r\n			new CopyProperties(node,nodeform);\r\n		} else if(req.getAttribute("form")!=null){\r\n                        nodeform = (NodeForm)req.getAttribute("form");\r\n			criteria.add(Restrictions.idEq(nodeform.getId()));\r\n			node = (Node) criteria.uniqueResult();\r\n		}\r\n		\r\n\r\n		req.setAttribute("model",node);\r\n		req.setAttribute("form",nodeform);\r\n		\r\n		\r\n		req.setAttribute("nodes",vector);\r\n		\r\n\r\n                if(req.getParameter("displayexport") !=null){\r\n     		    return mapping.findForward("displayexport");\r\n                }\r\n\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', 'NodesAction.java', 7, NULL, NULL),
(9, 'package net.nodepad.web.app.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport net.nodepad.web.app.api.rest.dto.NodeFieldDto;\r\nimport net.nodepad.web.app.api.rest.service.NodeFieldService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/NodeFields")\r\n@Api(value = "NodeField API")\r\npublic class NodeFieldResource {\r\n\r\n    @Autowired\r\n    private NodeFieldService ##modelobj##Service;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<NodeFieldDto> getAllNodeFields() {\r\n        return ##modelobj##Service.getAllNodeFields();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public NodeFieldDto getNodeField(@PathVariable final String id) {\r\n        return ##modelobj##Service.getNodeField(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<NodeFieldDto> addNodeField(@RequestBody final NodeFieldDto ##modelobj##) {\r\n        NodeFieldDto createdNodeField = ##modelobj##Service.createNodeField(##modelobj##);\r\n        return new ResponseEntity<>(createdNodeField, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteNodeField(@PathVariable final String id) {\r\n        ##modelobj##Service.deleteNodeField(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<NodeFieldDto> updateNodeField(@PathVariable final String id, @RequestBody final NodeFieldDto ##modelobj##) {\r\n        NodeFieldDto createdNodeField = ##modelobj##Service.updateNodeField(id, ##modelobj##);\r\n        return new ResponseEntity<>(createdNodeField, HttpStatus.OK);\r\n    }\r\n}\r\n', 'NodeFieldResource.javaAction.java', 19, NULL, NULL),
(10, 'package net.nodepad.web.app.api.rest.converter;\r\n\r\nimport org.springframework.stereotype.Service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport net.nodepad.web.app.api.rest.dto.NodeFieldDto;\r\nimport net.nodepad.web.app.api.rest.entity.NodeFieldEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Service\r\npublic class NodeFieldConverter extends AbstractConverter<NodeFieldEntity, NodeFieldDto> {\r\n\r\n    @Override\r\n    public void toDto(final NodeFieldEntity entity, final NodeFieldDto dto) {\r\n        // convert NodeFieldEntity to NodeFieldDto\r\n\r\n    }\r\n\r\n    @Override\r\n    public void fromDto(final NodeFieldEntity entity, final NodeFieldDto dto) {\r\n        // convert NodeFieldDto to NodeFieldEntity\r\n}\r\n', 'NodeFieldConverterAction.java', 19, NULL, NULL),
(11, 'package\r\n\r\nimport java.util.Collection;\r\n\r\nnet.nodepad.web.app.api.rest.converter;\r\n\r\nimport java.lang.reflect.ParameterizedType;\r\nimport java.util.ArrayList;\r\nimport java.util.Collection;\r\nimport java.util.List;\r\n\r\npublic abstract class AbstractConverter<EntityClass, DtoClass> {\r\n\r\n    private final Class<EntityClass> entityClass;\r\n    private final Class<DtoClass> dtoClass;\r\n\r\n    @SuppressWarnings("unchecked")\r\n    public AbstractConverter() {\r\n        final ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();\r\n        this.entityClass = (Class<EntityClass>) genericSuperclass.getActualTypeArguments()[0];\r\n        this.dtoClass = (Class<DtoClass>) genericSuperclass.getActualTypeArguments()[1];\r\n    }\r\n\r\n    protected DtoClass newDto() {\r\n        try {\r\n            return dtoClass.newInstance();\r\n        } catch (InstantiationException | IllegalAccessException e) {\r\n            throw new RuntimeException(e);\r\n        }\r\n    }\r\n\r\n    protected EntityClass newEntity() {\r\n        try {\r\n            return entityClass.newInstance();\r\n        } catch (InstantiationException | IllegalAccessException e) {\r\n            throw new RuntimeException(e);\r\n        }\r\n    }\r\n\r\n    public abstract void toDto(final EntityClass entity, final DtoClass dto);\r\n\r\n    public DtoClass toDto(final EntityClass entity) {\r\n        if (entity == null) {\r\n            return null;\r\n        }\r\n        final DtoClass dto = newDto();\r\n        toDto(entity, dto);\r\n        return dto;\r\n    }\r\n\r\n    public List<DtoClass> toDto(final Collection<? extends EntityClass> entities) {\r\n        final List<DtoClass> dtoCollection = new ArrayList<>();\r\n        entities.forEach(entity -> dtoCollection.add(toDto(entity)));\r\n        return dtoCollection;\r\n    }\r\n\r\n    public abstract void fromDto(final EntityClass entity, final DtoClass dto);\r\n\r\n\r\n    public EntityClass fromDto(final DtoClass dto) {\r\n        final EntityClass entity = newEntity();\r\n        fromDto(entity, dto);\r\n        return entity;\r\n    }\r\n}\r\n', 'AbstractConverterAction.java', 23, NULL, NULL),
(12, 'package net.nodepad.web.app.api.rest.dto;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\n\r\nimport com.fasterxml.jackson.annotation.JsonProperty;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport net.nodepad.model.*;\r\n\r\npublic class NodeFieldDto {\r\n\r\n    public NodeFieldDto() {}\r\n\r\n    @JsonProperty("id")\r\n    public String id;\r\n}\r\n', 'NodeFieldDtoAction.java', 19, NULL, NULL),
(13, 'package net.nodepad.web.app.api.rest.entity;\r\n\r\nimport javax.persistence.GeneratedValue;\r\nimport org.hibernate.annotations.GenericGenerator;\r\nimport javax.persistence.*;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport java.util.Vector;\r\nimport net.nodepad.model.*;\r\n\r\n@Entity\r\n@Table(name = "NodeFields")\r\npublic class NodeFieldEntity extends NodeField {\r\n\r\n    public NodeFieldEntity() {}\r\n\r\n    @Id\r\n    @GeneratedValue(generator = "uuid")\r\n    @GenericGenerator(name = "uuid", strategy = "uuid2")\r\n    @Column(name = "uuid", unique = true)\r\n    public String getId() {\r\n        return id;\r\n    }\r\n}\r\n', 'NodeFieldEntityAction.java', 19, NULL, NULL),
(14, 'package net.nodepad.web.app.api.rest.repository;\r\n\r\nimport org.springframework.stereotype.Repository;\r\n\r\nimport org.springframework.data.jpa.repository.JpaRepository;\r\nimport org.springframework.stereotype.Repository;\r\nimport net.nodepad.web.app.api.rest.entity.NodeFieldEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Repository\r\npublic interface NodeFieldRepository extends JpaRepository<NodeFieldEntity, String> {\r\n\r\n}', 'NodeFieldRepositoryAction.java', 19, NULL, NULL),
(15, 'package net.nodepad.web.app.api.rest.service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport org.springframework.stereotype.Service;\r\nimport net.nodepad.web.app.api.rest.converter.NodeFieldConverter;\r\nimport net.nodepad.web.app.api.rest.dto.NodeFieldDto;\r\nimport net.nodepad.web.app.api.rest.entity.NodeFieldEntity;\r\nimport net.nodepad.web.app.api.rest.repository.NodeFieldRepository;\r\nimport net.nodepad.model.*;\r\n\r\nimport java.util.List;\r\n\r\n@Service\r\npublic class NodeFieldService {\r\n\r\n    @Autowired\r\n    private NodeFieldRepository ##modelobj##Repository;\r\n\r\n    @Autowired\r\n    private NodeFieldConverter ##modelobj##Converter;\r\n\r\n        public List<NodeFieldDto> getAllNodeFields(){\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.findAll());\r\n    }\r\n\r\n    public NodeFieldDto getNodeField(final String id){\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.findOne(id));\r\n    }\r\n\r\n    public NodeFieldDto createNodeField(NodeFieldDto ##modelobj##Dto){\r\n        NodeFieldEntity ##modelobj##Entity = ##modelobj##Converter.fromDto(##modelobj##Dto);\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.save(##modelobj##Entity));\r\n    }\r\n\r\n    public NodeFieldDto updateNodeField(String id, NodeFieldDto ##modelobj##Dto){\r\n        ##modelobj##Repository.delete(id);\r\n        NodeFieldEntity ##modelobj##Entity = ##modelobj##Converter.fromDto(##modelobj##Dto);\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.save(##modelobj##Entity));\r\n    }\r\n\r\n    public void deleteNodeField(String id){\r\n        ##modelobj##Repository.delete(id);\r\n    }\r\n}\r\n', 'NodeFieldServiceAction.java', 19, NULL, NULL),
(16, 'package net.nodepad.web.app.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport net.nodepad.web.app.api.rest.dto.LinkDto;\r\nimport net.nodepad.web.app.api.rest.service.LinkService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/Links")\r\n@Api(value = "Link API")\r\npublic class LinkResource {\r\n\r\n    @Autowired\r\n    private LinkService ##modelobj##Service;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<LinkDto> getAllLinks() {\r\n        return ##modelobj##Service.getAllLinks();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public LinkDto getLink(@PathVariable final String id) {\r\n        return ##modelobj##Service.getLink(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<LinkDto> addLink(@RequestBody final LinkDto ##modelobj##) {\r\n        LinkDto createdLink = ##modelobj##Service.createLink(##modelobj##);\r\n        return new ResponseEntity<>(createdLink, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteLink(@PathVariable final String id) {\r\n        ##modelobj##Service.deleteLink(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<LinkDto> updateLink(@PathVariable final String id, @RequestBody final LinkDto ##modelobj##) {\r\n        LinkDto createdLink = ##modelobj##Service.updateLink(id, ##modelobj##);\r\n        return new ResponseEntity<>(createdLink, HttpStatus.OK);\r\n    }\r\n}\r\n', 'LinkResource.javaAction.java', 20, NULL, NULL),
(17, 'package net.nodepad.web.app.api.rest.converter;\r\n\r\nimport org.springframework.stereotype.Service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport net.nodepad.web.app.api.rest.dto.LinkDto;\r\nimport net.nodepad.web.app.api.rest.entity.LinkEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Service\r\npublic class LinkConverter extends AbstractConverter<LinkEntity, LinkDto> {\r\n\r\n    @Override\r\n    public void toDto(final LinkEntity entity, final LinkDto dto) {\r\n        // convert LinkEntity to LinkDto\r\n\r\n    }\r\n\r\n    @Override\r\n    public void fromDto(final LinkEntity entity, final LinkDto dto) {\r\n        // convert LinkDto to LinkEntity\r\n}\r\n', 'LinkConverterAction.java', 20, NULL, NULL),
(18, 'package net.nodepad.web.app.api.rest.dto;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\n\r\nimport com.fasterxml.jackson.annotation.JsonProperty;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport net.nodepad.model.*;\r\n\r\npublic class LinkDto {\r\n\r\n    public LinkDto() {}\r\n\r\n    @JsonProperty("id")\r\n    public String id;\r\n}\r\n', 'LinkDtoAction.java', 20, NULL, NULL),
(19, 'package net.nodepad.web.app.api.rest.entity;\r\n\r\nimport javax.persistence.GeneratedValue;\r\nimport org.hibernate.annotations.GenericGenerator;\r\nimport javax.persistence.*;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport java.util.Vector;\r\nimport net.nodepad.model.*;\r\n\r\n@Entity\r\n@Table(name = "Links")\r\npublic class LinkEntity extends Link {\r\n\r\n    public LinkEntity() {}\r\n\r\n    @Id\r\n    @GeneratedValue(generator = "uuid")\r\n    @GenericGenerator(name = "uuid", strategy = "uuid2")\r\n    @Column(name = "uuid", unique = true)\r\n    public String getId() {\r\n        return id;\r\n    }\r\n}\r\n', 'LinkEntityAction.java', 20, NULL, NULL),
(20, 'package net.nodepad.web.app.api.rest.repository;\r\n\r\nimport org.springframework.stereotype.Repository;\r\n\r\nimport org.springframework.data.jpa.repository.JpaRepository;\r\nimport org.springframework.stereotype.Repository;\r\nimport net.nodepad.web.app.api.rest.entity.LinkEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Repository\r\npublic interface LinkRepository extends JpaRepository<LinkEntity, String> {\r\n\r\n}', 'LinkRepositoryAction.java', 20, NULL, NULL),
(21, 'package net.nodepad.web.app.api.rest.service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport org.springframework.stereotype.Service;\r\nimport net.nodepad.web.app.api.rest.converter.LinkConverter;\r\nimport net.nodepad.web.app.api.rest.dto.LinkDto;\r\nimport net.nodepad.web.app.api.rest.entity.LinkEntity;\r\nimport net.nodepad.web.app.api.rest.repository.LinkRepository;\r\nimport net.nodepad.model.*;\r\n\r\nimport java.util.List;\r\n\r\n@Service\r\npublic class LinkService {\r\n\r\n    @Autowired\r\n    private LinkRepository ##modelobj##Repository;\r\n\r\n    @Autowired\r\n    private LinkConverter ##modelobj##Converter;\r\n\r\n        public List<LinkDto> getAllLinks(){\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.findAll());\r\n    }\r\n\r\n    public LinkDto getLink(final String id){\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.findOne(id));\r\n    }\r\n\r\n    public LinkDto createLink(LinkDto ##modelobj##Dto){\r\n        LinkEntity ##modelobj##Entity = ##modelobj##Converter.fromDto(##modelobj##Dto);\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.save(##modelobj##Entity));\r\n    }\r\n\r\n    public LinkDto updateLink(String id, LinkDto ##modelobj##Dto){\r\n        ##modelobj##Repository.delete(id);\r\n        LinkEntity ##modelobj##Entity = ##modelobj##Converter.fromDto(##modelobj##Dto);\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.save(##modelobj##Entity));\r\n    }\r\n\r\n    public void deleteLink(String id){\r\n        ##modelobj##Repository.delete(id);\r\n    }\r\n}\r\n', 'LinkServiceAction.java', 20, NULL, NULL),
(22, 'package net.nodepad.web.app.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport net.nodepad.web.app.api.rest.dto.UserDto;\r\nimport net.nodepad.web.app.api.rest.service.UserService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/Users")\r\n@Api(value = "User API")\r\npublic class UserResource {\r\n\r\n    @Autowired\r\n    private UserService ##modelobj##Service;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<UserDto> getAllUsers() {\r\n        return ##modelobj##Service.getAllUsers();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public UserDto getUser(@PathVariable final String id) {\r\n        return ##modelobj##Service.getUser(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<UserDto> addUser(@RequestBody final UserDto ##modelobj##) {\r\n        UserDto createdUser = ##modelobj##Service.createUser(##modelobj##);\r\n        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteUser(@PathVariable final String id) {\r\n        ##modelobj##Service.deleteUser(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<UserDto> updateUser(@PathVariable final String id, @RequestBody final UserDto ##modelobj##) {\r\n        UserDto createdUser = ##modelobj##Service.updateUser(id, ##modelobj##);\r\n        return new ResponseEntity<>(createdUser, HttpStatus.OK);\r\n    }\r\n}\r\n', 'UserResource.javaAction.java', 21, NULL, NULL),
(23, 'package net.nodepad.web.app.api.rest.converter;\r\n\r\nimport org.springframework.stereotype.Service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport net.nodepad.web.app.api.rest.dto.UserDto;\r\nimport net.nodepad.web.app.api.rest.entity.UserEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Service\r\npublic class UserConverter extends AbstractConverter<UserEntity, UserDto> {\r\n\r\n    @Override\r\n    public void toDto(final UserEntity entity, final UserDto dto) {\r\n        // convert UserEntity to UserDto\r\n\r\n    }\r\n\r\n    @Override\r\n    public void fromDto(final UserEntity entity, final UserDto dto) {\r\n        // convert UserDto to UserEntity\r\n}\r\n', 'UserConverterAction.java', 21, NULL, NULL),
(24, 'package net.nodepad.web.app.api.rest.dto;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\n\r\nimport com.fasterxml.jackson.annotation.JsonProperty;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport net.nodepad.model.*;\r\n\r\npublic class UserDto {\r\n\r\n    public UserDto() {}\r\n\r\n    @JsonProperty("id")\r\n    public String id;\r\n}\r\n', 'UserDtoAction.java', 21, NULL, NULL),
(25, 'package net.nodepad.web.app.api.rest.entity;\r\n\r\nimport javax.persistence.GeneratedValue;\r\nimport org.hibernate.annotations.GenericGenerator;\r\nimport javax.persistence.*;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport java.util.Vector;\r\nimport net.nodepad.model.*;\r\n\r\n@Entity\r\n@Table(name = "Users")\r\npublic class UserEntity extends User {\r\n\r\n    public UserEntity() {}\r\n\r\n    @Id\r\n    @GeneratedValue(generator = "uuid")\r\n    @GenericGenerator(name = "uuid", strategy = "uuid2")\r\n    @Column(name = "uuid", unique = true)\r\n    public String getId() {\r\n        return id;\r\n    }\r\n}\r\n', 'UserEntityAction.java', 21, NULL, NULL),
(26, 'package net.nodepad.web.app.api.rest.repository;\r\n\r\nimport org.springframework.stereotype.Repository;\r\n\r\nimport org.springframework.data.jpa.repository.JpaRepository;\r\nimport org.springframework.stereotype.Repository;\r\nimport net.nodepad.web.app.api.rest.entity.UserEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Repository\r\npublic interface UserRepository extends JpaRepository<UserEntity, String> {\r\n\r\n}', 'UserRepositoryAction.java', 21, NULL, NULL),
(27, 'package net.nodepad.web.app.api.rest.service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport org.springframework.stereotype.Service;\r\nimport net.nodepad.web.app.api.rest.converter.UserConverter;\r\nimport net.nodepad.web.app.api.rest.dto.UserDto;\r\nimport net.nodepad.web.app.api.rest.entity.UserEntity;\r\nimport net.nodepad.web.app.api.rest.repository.UserRepository;\r\nimport net.nodepad.model.*;\r\n\r\nimport java.util.List;\r\n\r\n@Service\r\npublic class UserService {\r\n\r\n    @Autowired\r\n    private UserRepository ##modelobj##Repository;\r\n\r\n    @Autowired\r\n    private UserConverter ##modelobj##Converter;\r\n\r\n        public List<UserDto> getAllUsers(){\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.findAll());\r\n    }\r\n\r\n    public UserDto getUser(final String id){\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.findOne(id));\r\n    }\r\n\r\n    public UserDto createUser(UserDto ##modelobj##Dto){\r\n        UserEntity ##modelobj##Entity = ##modelobj##Converter.fromDto(##modelobj##Dto);\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.save(##modelobj##Entity));\r\n    }\r\n\r\n    public UserDto updateUser(String id, UserDto ##modelobj##Dto){\r\n        ##modelobj##Repository.delete(id);\r\n        UserEntity ##modelobj##Entity = ##modelobj##Converter.fromDto(##modelobj##Dto);\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.save(##modelobj##Entity));\r\n    }\r\n\r\n    public void deleteUser(String id){\r\n        ##modelobj##Repository.delete(id);\r\n    }\r\n}\r\n', 'UserServiceAction.java', 21, NULL, NULL),
(28, 'package net.nodepad.web.app.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport net.nodepad.web.app.api.rest.dto.LinkUseDto;\r\nimport net.nodepad.web.app.api.rest.service.LinkUseService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/LinkUses")\r\n@Api(value = "LinkUse API")\r\npublic class LinkUseResource {\r\n\r\n    @Autowired\r\n    private LinkUseService ##modelobj##Service;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<LinkUseDto> getAllLinkUses() {\r\n        return ##modelobj##Service.getAllLinkUses();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public LinkUseDto getLinkUse(@PathVariable final String id) {\r\n        return ##modelobj##Service.getLinkUse(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<LinkUseDto> addLinkUse(@RequestBody final LinkUseDto ##modelobj##) {\r\n        LinkUseDto createdLinkUse = ##modelobj##Service.createLinkUse(##modelobj##);\r\n        return new ResponseEntity<>(createdLinkUse, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteLinkUse(@PathVariable final String id) {\r\n        ##modelobj##Service.deleteLinkUse(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<LinkUseDto> updateLinkUse(@PathVariable final String id, @RequestBody final LinkUseDto ##modelobj##) {\r\n        LinkUseDto createdLinkUse = ##modelobj##Service.updateLinkUse(id, ##modelobj##);\r\n        return new ResponseEntity<>(createdLinkUse, HttpStatus.OK);\r\n    }\r\n}\r\n', 'LinkUseResource.javaAction.java', 22, NULL, NULL),
(29, 'package net.nodepad.web.app.api.rest.converter;\r\n\r\nimport org.springframework.stereotype.Service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport net.nodepad.web.app.api.rest.dto.LinkUseDto;\r\nimport net.nodepad.web.app.api.rest.entity.LinkUseEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Service\r\npublic class LinkUseConverter extends AbstractConverter<LinkUseEntity, LinkUseDto> {\r\n\r\n    @Override\r\n    public void toDto(final LinkUseEntity entity, final LinkUseDto dto) {\r\n        // convert LinkUseEntity to LinkUseDto\r\n\r\n    }\r\n\r\n    @Override\r\n    public void fromDto(final LinkUseEntity entity, final LinkUseDto dto) {\r\n        // convert LinkUseDto to LinkUseEntity\r\n}\r\n', 'LinkUseConverterAction.java', 22, NULL, NULL),
(30, 'package net.nodepad.web.app.api.rest.dto;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\n\r\nimport com.fasterxml.jackson.annotation.JsonProperty;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport net.nodepad.model.*;\r\n\r\npublic class LinkUseDto {\r\n\r\n    public LinkUseDto() {}\r\n\r\n    @JsonProperty("id")\r\n    public String id;\r\n}\r\n', 'LinkUseDtoAction.java', 22, NULL, NULL),
(31, 'package net.nodepad.web.app.api.rest.entity;\r\n\r\nimport javax.persistence.GeneratedValue;\r\nimport org.hibernate.annotations.GenericGenerator;\r\nimport javax.persistence.*;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport java.util.Vector;\r\nimport net.nodepad.model.*;\r\n\r\n@Entity\r\n@Table(name = "LinkUses")\r\npublic class LinkUseEntity extends LinkUse {\r\n\r\n    public LinkUseEntity() {}\r\n\r\n    @Id\r\n    @GeneratedValue(generator = "uuid")\r\n    @GenericGenerator(name = "uuid", strategy = "uuid2")\r\n    @Column(name = "uuid", unique = true)\r\n    public String getId() {\r\n        return id;\r\n    }\r\n}\r\n', 'LinkUseEntityAction.java', 22, NULL, NULL),
(32, 'package net.nodepad.web.app.api.rest.repository;\r\n\r\nimport org.springframework.stereotype.Repository;\r\n\r\nimport org.springframework.data.jpa.repository.JpaRepository;\r\nimport org.springframework.stereotype.Repository;\r\nimport net.nodepad.web.app.api.rest.entity.LinkUseEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Repository\r\npublic interface LinkUseRepository extends JpaRepository<LinkUseEntity, String> {\r\n\r\n}', 'LinkUseRepositoryAction.java', 22, NULL, NULL),
(33, 'package net.nodepad.web.app.api.rest.service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport org.springframework.stereotype.Service;\r\nimport net.nodepad.web.app.api.rest.converter.LinkUseConverter;\r\nimport net.nodepad.web.app.api.rest.dto.LinkUseDto;\r\nimport net.nodepad.web.app.api.rest.entity.LinkUseEntity;\r\nimport net.nodepad.web.app.api.rest.repository.LinkUseRepository;\r\nimport net.nodepad.model.*;\r\n\r\nimport java.util.List;\r\n\r\n@Service\r\npublic class LinkUseService {\r\n\r\n    @Autowired\r\n    private LinkUseRepository ##modelobj##Repository;\r\n\r\n    @Autowired\r\n    private LinkUseConverter ##modelobj##Converter;\r\n\r\n        public List<LinkUseDto> getAllLinkUses(){\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.findAll());\r\n    }\r\n\r\n    public LinkUseDto getLinkUse(final String id){\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.findOne(id));\r\n    }\r\n\r\n    public LinkUseDto createLinkUse(LinkUseDto ##modelobj##Dto){\r\n        LinkUseEntity ##modelobj##Entity = ##modelobj##Converter.fromDto(##modelobj##Dto);\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.save(##modelobj##Entity));\r\n    }\r\n\r\n    public LinkUseDto updateLinkUse(String id, LinkUseDto ##modelobj##Dto){\r\n        ##modelobj##Repository.delete(id);\r\n        LinkUseEntity ##modelobj##Entity = ##modelobj##Converter.fromDto(##modelobj##Dto);\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.save(##modelobj##Entity));\r\n    }\r\n\r\n    public void deleteLinkUse(String id){\r\n        ##modelobj##Repository.delete(id);\r\n    }\r\n}\r\n', 'LinkUseServiceAction.java', 22, NULL, NULL),
(34, 'package net.nodepad.web.app.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport net.nodepad.web.app.api.rest.dto.NodeUserDto;\r\nimport net.nodepad.web.app.api.rest.service.NodeUserService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/NodeUsers")\r\n@Api(value = "NodeUser API")\r\npublic class NodeUserResource {\r\n\r\n    @Autowired\r\n    private NodeUserService ##modelobj##Service;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<NodeUserDto> getAllNodeUsers() {\r\n        return ##modelobj##Service.getAllNodeUsers();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public NodeUserDto getNodeUser(@PathVariable final String id) {\r\n        return ##modelobj##Service.getNodeUser(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<NodeUserDto> addNodeUser(@RequestBody final NodeUserDto ##modelobj##) {\r\n        NodeUserDto createdNodeUser = ##modelobj##Service.createNodeUser(##modelobj##);\r\n        return new ResponseEntity<>(createdNodeUser, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteNodeUser(@PathVariable final String id) {\r\n        ##modelobj##Service.deleteNodeUser(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<NodeUserDto> updateNodeUser(@PathVariable final String id, @RequestBody final NodeUserDto ##modelobj##) {\r\n        NodeUserDto createdNodeUser = ##modelobj##Service.updateNodeUser(id, ##modelobj##);\r\n        return new ResponseEntity<>(createdNodeUser, HttpStatus.OK);\r\n    }\r\n}\r\n', 'NodeUserResource.javaAction.java', 23, NULL, NULL),
(35, 'package net.nodepad.web.app.api.rest.converter;\r\n\r\nimport org.springframework.stereotype.Service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport net.nodepad.web.app.api.rest.dto.NodeUserDto;\r\nimport net.nodepad.web.app.api.rest.entity.NodeUserEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Service\r\npublic class NodeUserConverter extends AbstractConverter<NodeUserEntity, NodeUserDto> {\r\n\r\n    @Override\r\n    public void toDto(final NodeUserEntity entity, final NodeUserDto dto) {\r\n        // convert NodeUserEntity to NodeUserDto\r\n\r\n    }\r\n\r\n    @Override\r\n    public void fromDto(final NodeUserEntity entity, final NodeUserDto dto) {\r\n        // convert NodeUserDto to NodeUserEntity\r\n}\r\n', 'NodeUserConverterAction.java', 23, NULL, NULL),
(36, 'package net.nodepad.web.app.api.rest.dto;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\n\r\nimport com.fasterxml.jackson.annotation.JsonProperty;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport net.nodepad.model.*;\r\n\r\npublic class NodeUserDto {\r\n\r\n    public NodeUserDto() {}\r\n\r\n    @JsonProperty("id")\r\n    public String id;\r\n}\r\n', 'NodeUserDtoAction.java', 23, NULL, NULL),
(37, 'package net.nodepad.web.app.api.rest.entity;\r\n\r\nimport javax.persistence.GeneratedValue;\r\nimport org.hibernate.annotations.GenericGenerator;\r\nimport javax.persistence.*;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport java.util.Vector;\r\nimport net.nodepad.model.*;\r\n\r\n@Entity\r\n@Table(name = "NodeUsers")\r\npublic class NodeUserEntity extends NodeUser {\r\n\r\n    public NodeUserEntity() {}\r\n\r\n    @Id\r\n    @GeneratedValue(generator = "uuid")\r\n    @GenericGenerator(name = "uuid", strategy = "uuid2")\r\n    @Column(name = "uuid", unique = true)\r\n    public String getId() {\r\n        return id;\r\n    }\r\n}\r\n', 'NodeUserEntityAction.java', 23, NULL, NULL),
(38, 'package net.nodepad.web.app.api.rest.repository;\r\n\r\nimport org.springframework.stereotype.Repository;\r\n\r\nimport org.springframework.data.jpa.repository.JpaRepository;\r\nimport org.springframework.stereotype.Repository;\r\nimport net.nodepad.web.app.api.rest.entity.NodeUserEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Repository\r\npublic interface NodeUserRepository extends JpaRepository<NodeUserEntity, String> {\r\n\r\n}', 'NodeUserRepositoryAction.java', 23, NULL, NULL),
(39, 'package net.nodepad.web.app.api.rest.service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport org.springframework.stereotype.Service;\r\nimport net.nodepad.web.app.api.rest.converter.NodeUserConverter;\r\nimport net.nodepad.web.app.api.rest.dto.NodeUserDto;\r\nimport net.nodepad.web.app.api.rest.entity.NodeUserEntity;\r\nimport net.nodepad.web.app.api.rest.repository.NodeUserRepository;\r\nimport net.nodepad.model.*;\r\n\r\nimport java.util.List;\r\n\r\n@Service\r\npublic class NodeUserService {\r\n\r\n    @Autowired\r\n    private NodeUserRepository ##modelobj##Repository;\r\n\r\n    @Autowired\r\n    private NodeUserConverter ##modelobj##Converter;\r\n\r\n        public List<NodeUserDto> getAllNodeUsers(){\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.findAll());\r\n    }\r\n\r\n    public NodeUserDto getNodeUser(final String id){\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.findOne(id));\r\n    }\r\n\r\n    public NodeUserDto createNodeUser(NodeUserDto ##modelobj##Dto){\r\n        NodeUserEntity ##modelobj##Entity = ##modelobj##Converter.fromDto(##modelobj##Dto);\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.save(##modelobj##Entity));\r\n    }\r\n\r\n    public NodeUserDto updateNodeUser(String id, NodeUserDto ##modelobj##Dto){\r\n        ##modelobj##Repository.delete(id);\r\n        NodeUserEntity ##modelobj##Entity = ##modelobj##Converter.fromDto(##modelobj##Dto);\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.save(##modelobj##Entity));\r\n    }\r\n\r\n    public void deleteNodeUser(String id){\r\n        ##modelobj##Repository.delete(id);\r\n    }\r\n}\r\n', 'NodeUserServiceAction.java', 23, NULL, NULL);
INSERT INTO `STRUTS_ACTION` (`ID`, `CODE`, `FILENAME`, `SENTENCE_FK`, `TARGETEEJSP_FK`, `TARGETEEACTION_FK`) VALUES
(40, 'package net.nodepad.web.app.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport net.nodepad.web.app.api.rest.dto.NodeFieldDto;\r\nimport net.nodepad.web.app.api.rest.service.NodeFieldService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/NodeFields")\r\n@Api(value = "NodeField API")\r\npublic class NodeFieldResource {\r\n\r\n    @Autowired\r\n    private NodeFieldService nodeFieldService;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<NodeFieldDto> getAllNodeFields() {\r\n        return nodeFieldService.getAllNodeFields();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public NodeFieldDto getNodeField(@PathVariable final String id) {\r\n        return nodeFieldService.getNodeField(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<NodeFieldDto> addNodeField(@RequestBody final NodeFieldDto nodeField) {\r\n        NodeFieldDto createdNodeField = nodeFieldService.createNodeField(nodeField);\r\n        return new ResponseEntity<>(createdNodeField, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteNodeField(@PathVariable final String id) {\r\n        nodeFieldService.deleteNodeField(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<NodeFieldDto> updateNodeField(@PathVariable final String id, @RequestBody final NodeFieldDto nodeField) {\r\n        NodeFieldDto createdNodeField = nodeFieldService.updateNodeField(id, nodeField);\r\n        return new ResponseEntity<>(createdNodeField, HttpStatus.OK);\r\n    }\r\n}\r\n', 'NodeFieldResource.java.java', 19, NULL, NULL),
(41, 'package com.theuniversalgraph.api.rest.converter;\r\n\r\nimport org.springframework.stereotype.Service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport com.theuniversalgraph.api.rest.dto.NodeFieldDto;\r\nimport com.theuniversalgraph.api.rest.entity.NodeFieldEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Service\r\npublic class NodeFieldConverter extends AbstractConverter<NodeFieldEntity, NodeFieldDto> {\r\n\r\n    @Override\r\n    public void toDto(final NodeFieldEntity entity, final NodeFieldDto dto) {\r\n        // convert NodeFieldEntity to NodeFieldDto\r\n\r\n    }\r\n\r\n    @Override\r\n    public void fromDto(final NodeFieldEntity entity, final NodeFieldDto dto) {\r\n        // convert NodeFieldDto to NodeFieldEntity\r\n}\r\n', 'NodeFieldConverter.java', 19, NULL, NULL),
(42, 'package\r\n\r\nimport java.util.Collection;\r\n\r\ncom.theuniversalgraph.api.rest.converter;\r\n\r\nimport java.lang.reflect.ParameterizedType;\r\nimport java.util.ArrayList;\r\nimport java.util.Collection;\r\nimport java.util.List;\r\n\r\npublic abstract class AbstractConverter<EntityClass, DtoClass> {\r\n\r\n    private final Class<EntityClass> entityClass;\r\n    private final Class<DtoClass> dtoClass;\r\n\r\n    @SuppressWarnings("unchecked")\r\n    public AbstractConverter() {\r\n        final ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();\r\n        this.entityClass = (Class<EntityClass>) genericSuperclass.getActualTypeArguments()[0];\r\n        this.dtoClass = (Class<DtoClass>) genericSuperclass.getActualTypeArguments()[1];\r\n    }\r\n\r\n    protected DtoClass newDto() {\r\n        try {\r\n            return dtoClass.newInstance();\r\n        } catch (InstantiationException | IllegalAccessException e) {\r\n            throw new RuntimeException(e);\r\n        }\r\n    }\r\n\r\n    protected EntityClass newEntity() {\r\n        try {\r\n            return entityClass.newInstance();\r\n        } catch (InstantiationException | IllegalAccessException e) {\r\n            throw new RuntimeException(e);\r\n        }\r\n    }\r\n\r\n    public abstract void toDto(final EntityClass entity, final DtoClass dto);\r\n\r\n    public DtoClass toDto(final EntityClass entity) {\r\n        if (entity == null) {\r\n            return null;\r\n        }\r\n        final DtoClass dto = newDto();\r\n        toDto(entity, dto);\r\n        return dto;\r\n    }\r\n\r\n    public List<DtoClass> toDto(final Collection<? extends EntityClass> entities) {\r\n        final List<DtoClass> dtoCollection = new ArrayList<>();\r\n        entities.forEach(entity -> dtoCollection.add(toDto(entity)));\r\n        return dtoCollection;\r\n    }\r\n\r\n    public abstract void fromDto(final EntityClass entity, final DtoClass dto);\r\n\r\n\r\n    public EntityClass fromDto(final DtoClass dto) {\r\n        final EntityClass entity = newEntity();\r\n        fromDto(entity, dto);\r\n        return entity;\r\n    }\r\n}\r\n', 'AbstractConverter.java', 25, NULL, NULL),
(43, 'package com.theuniversalgraph.api.rest.dto;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\n\r\nimport com.fasterxml.jackson.annotation.JsonProperty;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport net.nodepad.model.*;\r\n\r\npublic class NodeFieldDto {\r\n\r\n    public NodeFieldDto() {}\r\n\r\n    @JsonProperty("id")\r\n    public String id;\r\n}\r\n', 'NodeFieldDto.java', 19, NULL, NULL),
(44, 'package com.theuniversalgraph.api.rest.entity;\r\n\r\nimport javax.persistence.GeneratedValue;\r\nimport org.hibernate.annotations.GenericGenerator;\r\nimport javax.persistence.*;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport java.util.Vector;\r\nimport net.nodepad.model.*;\r\n\r\n@Entity\r\n@Table(name = "NodeFields")\r\npublic class NodeFieldEntity extends NodeField {\r\n\r\n    public NodeFieldEntity() {}\r\n\r\n    @Id\r\n    @GeneratedValue(generator = "uuid")\r\n    @GenericGenerator(name = "uuid", strategy = "uuid2")\r\n    @Column(name = "uuid", unique = true)\r\n    public String getId() {\r\n        return id;\r\n    }\r\n}\r\n', 'NodeFieldEntity.java', 19, NULL, NULL),
(45, 'package com.theuniversalgraph.api.rest.repository;\r\n\r\nimport org.springframework.stereotype.Repository;\r\n\r\nimport org.springframework.data.jpa.repository.JpaRepository;\r\nimport org.springframework.stereotype.Repository;\r\nimport com.theuniversalgraph.api.rest.entity.NodeFieldEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Repository\r\npublic interface NodeFieldRepository extends JpaRepository<NodeFieldEntity, String> {\r\n\r\n}', 'NodeFieldRepository.java', 19, NULL, NULL),
(46, 'package com.theuniversalgraph.api.rest.service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport org.springframework.stereotype.Service;\r\nimport com.theuniversalgraph.api.rest.converter.NodeFieldConverter;\r\nimport com.theuniversalgraph.api.rest.dto.NodeFieldDto;\r\nimport com.theuniversalgraph.api.rest.entity.NodeFieldEntity;\r\nimport com.theuniversalgraph.api.rest.repository.NodeFieldRepository;\r\nimport net.nodepad.model.*;\r\n\r\nimport java.util.List;\r\n\r\n@Service\r\npublic class NodeFieldService {\r\n\r\n    @Autowired\r\n    private NodeFieldRepository nodeFieldRepository;\r\n\r\n    @Autowired\r\n    private NodeFieldConverter nodeFieldConverter;\r\n\r\n        public List<NodeFieldDto> getAllNodeFields(){\r\n        return nodeFieldConverter.toDto(nodeFieldRepository.findAll());\r\n    }\r\n\r\n    public NodeFieldDto getNodeField(final String id){\r\n        return nodeFieldConverter.toDto(nodeFieldRepository.findOne(id));\r\n    }\r\n\r\n    public NodeFieldDto createNodeField(NodeFieldDto nodeFieldDto){\r\n        NodeFieldEntity nodeFieldEntity = nodeFieldConverter.fromDto(nodeFieldDto);\r\n        return nodeFieldConverter.toDto(nodeFieldRepository.save(nodeFieldEntity));\r\n    }\r\n\r\n    public NodeFieldDto updateNodeField(String id, NodeFieldDto nodeFieldDto){\r\n        nodeFieldRepository.delete(id);\r\n        NodeFieldEntity nodeFieldEntity = nodeFieldConverter.fromDto(nodeFieldDto);\r\n        return nodeFieldConverter.toDto(nodeFieldRepository.save(nodeFieldEntity));\r\n    }\r\n\r\n    public void deleteNodeField(String id){\r\n        nodeFieldRepository.delete(id);\r\n    }\r\n}\r\n', 'NodeFieldService.java', 19, NULL, NULL),
(47, 'package net.nodepad.web.app.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport net.nodepad.web.app.api.rest.dto.UserDto;\r\nimport net.nodepad.web.app.api.rest.service.UserService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/Users")\r\n@Api(value = "User API")\r\npublic class UserResource {\r\n\r\n    @Autowired\r\n    private UserService userService;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<UserDto> getAllUsers() {\r\n        return userService.getAllUsers();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public UserDto getUser(@PathVariable final String id) {\r\n        return userService.getUser(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<UserDto> addUser(@RequestBody final UserDto user) {\r\n        UserDto createdUser = userService.createUser(user);\r\n        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteUser(@PathVariable final String id) {\r\n        userService.deleteUser(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<UserDto> updateUser(@PathVariable final String id, @RequestBody final UserDto user) {\r\n        UserDto createdUser = userService.updateUser(id, user);\r\n        return new ResponseEntity<>(createdUser, HttpStatus.OK);\r\n    }\r\n}\r\n', 'UserResource.java.java', 21, NULL, NULL),
(48, 'package com.theuniversalgraph.api.rest.converter;\r\n\r\nimport org.springframework.stereotype.Service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport com.theuniversalgraph.api.rest.dto.UserDto;\r\nimport com.theuniversalgraph.api.rest.entity.UserEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Service\r\npublic class UserConverter extends AbstractConverter<UserEntity, UserDto> {\r\n\r\n    @Override\r\n    public void toDto(final UserEntity entity, final UserDto dto) {\r\n        // convert UserEntity to UserDto\r\n\r\n    }\r\n\r\n    @Override\r\n    public void fromDto(final UserEntity entity, final UserDto dto) {\r\n        // convert UserDto to UserEntity\r\n}\r\n', 'UserConverter.java', 21, NULL, NULL),
(49, 'package com.theuniversalgraph.api.rest.dto;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\n\r\nimport com.fasterxml.jackson.annotation.JsonProperty;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport net.nodepad.model.*;\r\n\r\npublic class UserDto {\r\n\r\n    public UserDto() {}\r\n\r\n    @JsonProperty("id")\r\n    public String id;\r\n}\r\n', 'UserDto.java', 21, NULL, NULL),
(50, 'package com.theuniversalgraph.api.rest.entity;\r\n\r\nimport javax.persistence.GeneratedValue;\r\nimport org.hibernate.annotations.GenericGenerator;\r\nimport javax.persistence.*;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport java.util.Vector;\r\nimport net.nodepad.model.*;\r\n\r\n@Entity\r\n@Table(name = "Users")\r\npublic class UserEntity extends User {\r\n\r\n    public UserEntity() {}\r\n\r\n    @Id\r\n    @GeneratedValue(generator = "uuid")\r\n    @GenericGenerator(name = "uuid", strategy = "uuid2")\r\n    @Column(name = "uuid", unique = true)\r\n    public String getId() {\r\n        return id;\r\n    }\r\n}\r\n', 'UserEntity.java', 21, NULL, NULL),
(51, 'package com.theuniversalgraph.api.rest.repository;\r\n\r\nimport org.springframework.stereotype.Repository;\r\n\r\nimport org.springframework.data.jpa.repository.JpaRepository;\r\nimport org.springframework.stereotype.Repository;\r\nimport com.theuniversalgraph.api.rest.entity.UserEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Repository\r\npublic interface UserRepository extends JpaRepository<UserEntity, String> {\r\n\r\n}', 'UserRepository.java', 21, NULL, NULL),
(52, 'package com.theuniversalgraph.api.rest.service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport org.springframework.stereotype.Service;\r\nimport com.theuniversalgraph.api.rest.converter.UserConverter;\r\nimport com.theuniversalgraph.api.rest.dto.UserDto;\r\nimport com.theuniversalgraph.api.rest.entity.UserEntity;\r\nimport com.theuniversalgraph.api.rest.repository.UserRepository;\r\nimport net.nodepad.model.*;\r\n\r\nimport java.util.List;\r\n\r\n@Service\r\npublic class UserService {\r\n\r\n    @Autowired\r\n    private UserRepository userRepository;\r\n\r\n    @Autowired\r\n    private UserConverter userConverter;\r\n\r\n        public List<UserDto> getAllUsers(){\r\n        return userConverter.toDto(userRepository.findAll());\r\n    }\r\n\r\n    public UserDto getUser(final String id){\r\n        return userConverter.toDto(userRepository.findOne(id));\r\n    }\r\n\r\n    public UserDto createUser(UserDto userDto){\r\n        UserEntity userEntity = userConverter.fromDto(userDto);\r\n        return userConverter.toDto(userRepository.save(userEntity));\r\n    }\r\n\r\n    public UserDto updateUser(String id, UserDto userDto){\r\n        userRepository.delete(id);\r\n        UserEntity userEntity = userConverter.fromDto(userDto);\r\n        return userConverter.toDto(userRepository.save(userEntity));\r\n    }\r\n\r\n    public void deleteUser(String id){\r\n        userRepository.delete(id);\r\n    }\r\n}\r\n', 'UserService.java', 21, NULL, NULL),
(53, 'package net.nodepad.web.app.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport net.nodepad.web.app.api.rest.dto.LinkDto;\r\nimport net.nodepad.web.app.api.rest.service.LinkService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/Links")\r\n@Api(value = "Link API")\r\npublic class LinkResource {\r\n\r\n    @Autowired\r\n    private LinkService linkService;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<LinkDto> getAllLinks() {\r\n        return linkService.getAllLinks();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public LinkDto getLink(@PathVariable final String id) {\r\n        return linkService.getLink(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<LinkDto> addLink(@RequestBody final LinkDto link) {\r\n        LinkDto createdLink = linkService.createLink(link);\r\n        return new ResponseEntity<>(createdLink, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteLink(@PathVariable final String id) {\r\n        linkService.deleteLink(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<LinkDto> updateLink(@PathVariable final String id, @RequestBody final LinkDto link) {\r\n        LinkDto createdLink = linkService.updateLink(id, link);\r\n        return new ResponseEntity<>(createdLink, HttpStatus.OK);\r\n    }\r\n}\r\n', 'LinkResource.java.java', 20, NULL, NULL),
(54, 'package com.theuniversalgraph.api.rest.converter;\r\n\r\nimport org.springframework.stereotype.Service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport com.theuniversalgraph.api.rest.dto.LinkDto;\r\nimport com.theuniversalgraph.api.rest.entity.LinkEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Service\r\npublic class LinkConverter extends AbstractConverter<LinkEntity, LinkDto> {\r\n\r\n    @Override\r\n    public void toDto(final LinkEntity entity, final LinkDto dto) {\r\n        // convert LinkEntity to LinkDto\r\n\r\n    }\r\n\r\n    @Override\r\n    public void fromDto(final LinkEntity entity, final LinkDto dto) {\r\n        // convert LinkDto to LinkEntity\r\n}\r\n', 'LinkConverter.java', 20, NULL, NULL),
(55, 'package com.theuniversalgraph.api.rest.dto;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\n\r\nimport com.fasterxml.jackson.annotation.JsonProperty;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport net.nodepad.model.*;\r\n\r\npublic class LinkDto {\r\n\r\n    public LinkDto() {}\r\n\r\n    @JsonProperty("id")\r\n    public String id;\r\n}\r\n', 'LinkDto.java', 20, NULL, NULL),
(56, 'package com.theuniversalgraph.api.rest.entity;\r\n\r\nimport javax.persistence.GeneratedValue;\r\nimport org.hibernate.annotations.GenericGenerator;\r\nimport javax.persistence.*;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport java.util.Vector;\r\nimport net.nodepad.model.*;\r\n\r\n@Entity\r\n@Table(name = "Links")\r\npublic class LinkEntity extends Link {\r\n\r\n    public LinkEntity() {}\r\n\r\n    @Id\r\n    @GeneratedValue(generator = "uuid")\r\n    @GenericGenerator(name = "uuid", strategy = "uuid2")\r\n    @Column(name = "uuid", unique = true)\r\n    public String getId() {\r\n        return id;\r\n    }\r\n}\r\n', 'LinkEntity.java', 20, NULL, NULL),
(57, 'package com.theuniversalgraph.api.rest.repository;\r\n\r\nimport org.springframework.stereotype.Repository;\r\n\r\nimport org.springframework.data.jpa.repository.JpaRepository;\r\nimport org.springframework.stereotype.Repository;\r\nimport com.theuniversalgraph.api.rest.entity.LinkEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Repository\r\npublic interface LinkRepository extends JpaRepository<LinkEntity, String> {\r\n\r\n}', 'LinkRepository.java', 20, NULL, NULL),
(58, 'package com.theuniversalgraph.api.rest.service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport org.springframework.stereotype.Service;\r\nimport com.theuniversalgraph.api.rest.converter.LinkConverter;\r\nimport com.theuniversalgraph.api.rest.dto.LinkDto;\r\nimport com.theuniversalgraph.api.rest.entity.LinkEntity;\r\nimport com.theuniversalgraph.api.rest.repository.LinkRepository;\r\nimport net.nodepad.model.*;\r\n\r\nimport java.util.List;\r\n\r\n@Service\r\npublic class LinkService {\r\n\r\n    @Autowired\r\n    private LinkRepository linkRepository;\r\n\r\n    @Autowired\r\n    private LinkConverter linkConverter;\r\n\r\n        public List<LinkDto> getAllLinks(){\r\n        return linkConverter.toDto(linkRepository.findAll());\r\n    }\r\n\r\n    public LinkDto getLink(final String id){\r\n        return linkConverter.toDto(linkRepository.findOne(id));\r\n    }\r\n\r\n    public LinkDto createLink(LinkDto linkDto){\r\n        LinkEntity linkEntity = linkConverter.fromDto(linkDto);\r\n        return linkConverter.toDto(linkRepository.save(linkEntity));\r\n    }\r\n\r\n    public LinkDto updateLink(String id, LinkDto linkDto){\r\n        linkRepository.delete(id);\r\n        LinkEntity linkEntity = linkConverter.fromDto(linkDto);\r\n        return linkConverter.toDto(linkRepository.save(linkEntity));\r\n    }\r\n\r\n    public void deleteLink(String id){\r\n        linkRepository.delete(id);\r\n    }\r\n}\r\n', 'LinkService.java', 20, NULL, NULL),
(59, 'package net.nodepad.web.app.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport net.nodepad.web.app.api.rest.dto.LinkUseDto;\r\nimport net.nodepad.web.app.api.rest.service.LinkUseService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/LinkUses")\r\n@Api(value = "LinkUse API")\r\npublic class LinkUseResource {\r\n\r\n    @Autowired\r\n    private LinkUseService linkUseService;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<LinkUseDto> getAllLinkUses() {\r\n        return linkUseService.getAllLinkUses();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public LinkUseDto getLinkUse(@PathVariable final String id) {\r\n        return linkUseService.getLinkUse(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<LinkUseDto> addLinkUse(@RequestBody final LinkUseDto linkUse) {\r\n        LinkUseDto createdLinkUse = linkUseService.createLinkUse(linkUse);\r\n        return new ResponseEntity<>(createdLinkUse, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteLinkUse(@PathVariable final String id) {\r\n        linkUseService.deleteLinkUse(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<LinkUseDto> updateLinkUse(@PathVariable final String id, @RequestBody final LinkUseDto linkUse) {\r\n        LinkUseDto createdLinkUse = linkUseService.updateLinkUse(id, linkUse);\r\n        return new ResponseEntity<>(createdLinkUse, HttpStatus.OK);\r\n    }\r\n}\r\n', 'LinkUseResource.java.java', 22, NULL, NULL),
(60, 'package com.theuniversalgraph.api.rest.converter;\r\n\r\nimport org.springframework.stereotype.Service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport com.theuniversalgraph.api.rest.dto.LinkUseDto;\r\nimport com.theuniversalgraph.api.rest.entity.LinkUseEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Service\r\npublic class LinkUseConverter extends AbstractConverter<LinkUseEntity, LinkUseDto> {\r\n\r\n    @Override\r\n    public void toDto(final LinkUseEntity entity, final LinkUseDto dto) {\r\n        // convert LinkUseEntity to LinkUseDto\r\n\r\n    }\r\n\r\n    @Override\r\n    public void fromDto(final LinkUseEntity entity, final LinkUseDto dto) {\r\n        // convert LinkUseDto to LinkUseEntity\r\n}\r\n', 'LinkUseConverter.java', 22, NULL, NULL),
(61, 'package com.theuniversalgraph.api.rest.dto;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\n\r\nimport com.fasterxml.jackson.annotation.JsonProperty;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport net.nodepad.model.*;\r\n\r\npublic class LinkUseDto {\r\n\r\n    public LinkUseDto() {}\r\n\r\n    @JsonProperty("id")\r\n    public String id;\r\n}\r\n', 'LinkUseDto.java', 22, NULL, NULL),
(62, 'package com.theuniversalgraph.api.rest.entity;\r\n\r\nimport javax.persistence.GeneratedValue;\r\nimport org.hibernate.annotations.GenericGenerator;\r\nimport javax.persistence.*;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport java.util.Vector;\r\nimport net.nodepad.model.*;\r\n\r\n@Entity\r\n@Table(name = "LinkUses")\r\npublic class LinkUseEntity extends LinkUse {\r\n\r\n    public LinkUseEntity() {}\r\n\r\n    @Id\r\n    @GeneratedValue(generator = "uuid")\r\n    @GenericGenerator(name = "uuid", strategy = "uuid2")\r\n    @Column(name = "uuid", unique = true)\r\n    public String getId() {\r\n        return id;\r\n    }\r\n}\r\n', 'LinkUseEntity.java', 22, NULL, NULL),
(63, 'package com.theuniversalgraph.api.rest.repository;\r\n\r\nimport org.springframework.stereotype.Repository;\r\n\r\nimport org.springframework.data.jpa.repository.JpaRepository;\r\nimport org.springframework.stereotype.Repository;\r\nimport com.theuniversalgraph.api.rest.entity.LinkUseEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Repository\r\npublic interface LinkUseRepository extends JpaRepository<LinkUseEntity, String> {\r\n\r\n}', 'LinkUseRepository.java', 22, NULL, NULL),
(64, 'package com.theuniversalgraph.api.rest.service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport org.springframework.stereotype.Service;\r\nimport com.theuniversalgraph.api.rest.converter.LinkUseConverter;\r\nimport com.theuniversalgraph.api.rest.dto.LinkUseDto;\r\nimport com.theuniversalgraph.api.rest.entity.LinkUseEntity;\r\nimport com.theuniversalgraph.api.rest.repository.LinkUseRepository;\r\nimport net.nodepad.model.*;\r\n\r\nimport java.util.List;\r\n\r\n@Service\r\npublic class LinkUseService {\r\n\r\n    @Autowired\r\n    private LinkUseRepository linkUseRepository;\r\n\r\n    @Autowired\r\n    private LinkUseConverter linkUseConverter;\r\n\r\n        public List<LinkUseDto> getAllLinkUses(){\r\n        return linkUseConverter.toDto(linkUseRepository.findAll());\r\n    }\r\n\r\n    public LinkUseDto getLinkUse(final String id){\r\n        return linkUseConverter.toDto(linkUseRepository.findOne(id));\r\n    }\r\n\r\n    public LinkUseDto createLinkUse(LinkUseDto linkUseDto){\r\n        LinkUseEntity linkUseEntity = linkUseConverter.fromDto(linkUseDto);\r\n        return linkUseConverter.toDto(linkUseRepository.save(linkUseEntity));\r\n    }\r\n\r\n    public LinkUseDto updateLinkUse(String id, LinkUseDto linkUseDto){\r\n        linkUseRepository.delete(id);\r\n        LinkUseEntity linkUseEntity = linkUseConverter.fromDto(linkUseDto);\r\n        return linkUseConverter.toDto(linkUseRepository.save(linkUseEntity));\r\n    }\r\n\r\n    public void deleteLinkUse(String id){\r\n        linkUseRepository.delete(id);\r\n    }\r\n}\r\n', 'LinkUseService.java', 22, NULL, NULL),
(77, 'package com.theuniversalgraph.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport com.theuniversalgraph.api.rest.dto.NodeDto;\r\nimport com.theuniversalgraph.api.rest.service.NodeService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/Nodes")\r\n@Api(value = "Node API")\r\npublic class NodeResource {\r\n\r\n    @Autowired\r\n    private NodeService nodeService;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<NodeDto> getAllNodes() {\r\n        return nodeService.getAllNodes();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public NodeDto getNode(@PathVariable final String id) {\r\n        return nodeService.getNode(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<NodeDto> addNode(@RequestBody final NodeDto node) {\r\n        NodeDto createdNode = nodeService.createNode(node);\r\n        return new ResponseEntity<>(createdNode, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteNode(@PathVariable final String id) {\r\n        nodeService.deleteNode(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<NodeDto> updateNode(@PathVariable final String id, @RequestBody final NodeDto node) {\r\n        NodeDto createdNode = nodeService.updateNode(id, node);\r\n        return new ResponseEntity<>(createdNode, HttpStatus.OK);\r\n    }\r\n}\r\n', 'NodeResource.java', 3, NULL, NULL),
(65, 'package net.nodepad.web.app.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport net.nodepad.web.app.api.rest.dto.NodeUserDto;\r\nimport net.nodepad.web.app.api.rest.service.NodeUserService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/NodeUsers")\r\n@Api(value = "NodeUser API")\r\npublic class NodeUserResource {\r\n\r\n    @Autowired\r\n    private NodeUserService nodeUserService;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<NodeUserDto> getAllNodeUsers() {\r\n        return nodeUserService.getAllNodeUsers();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public NodeUserDto getNodeUser(@PathVariable final String id) {\r\n        return nodeUserService.getNodeUser(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<NodeUserDto> addNodeUser(@RequestBody final NodeUserDto nodeUser) {\r\n        NodeUserDto createdNodeUser = nodeUserService.createNodeUser(nodeUser);\r\n        return new ResponseEntity<>(createdNodeUser, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteNodeUser(@PathVariable final String id) {\r\n        nodeUserService.deleteNodeUser(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<NodeUserDto> updateNodeUser(@PathVariable final String id, @RequestBody final NodeUserDto nodeUser) {\r\n        NodeUserDto createdNodeUser = nodeUserService.updateNodeUser(id, nodeUser);\r\n        return new ResponseEntity<>(createdNodeUser, HttpStatus.OK);\r\n    }\r\n}\r\n', 'NodeUserResource.java.java', 23, NULL, NULL),
(66, 'package com.theuniversalgraph.api.rest.converter;\r\n\r\nimport org.springframework.stereotype.Service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport com.theuniversalgraph.api.rest.dto.NodeUserDto;\r\nimport com.theuniversalgraph.api.rest.entity.NodeUserEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Service\r\npublic class NodeUserConverter extends AbstractConverter<NodeUserEntity, NodeUserDto> {\r\n\r\n    @Override\r\n    public void toDto(final NodeUserEntity entity, final NodeUserDto dto) {\r\n        // convert NodeUserEntity to NodeUserDto\r\n\r\n    }\r\n\r\n    @Override\r\n    public void fromDto(final NodeUserEntity entity, final NodeUserDto dto) {\r\n        // convert NodeUserDto to NodeUserEntity\r\n}\r\n', 'NodeUserConverter.java', 25, NULL, NULL),
(67, 'package com.theuniversalgraph.api.rest.dto;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\n\r\nimport com.fasterxml.jackson.annotation.JsonProperty;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport net.nodepad.model.*;\r\n\r\npublic class NodeUserDto {\r\n\r\n    public NodeUserDto() {}\r\n\r\n    @JsonProperty("id")\r\n    public String id;\r\n}\r\n', 'NodeUserDto.java', 25, NULL, NULL),
(68, 'package com.theuniversalgraph.api.rest.entity;\r\n\r\nimport javax.persistence.GeneratedValue;\r\nimport org.hibernate.annotations.GenericGenerator;\r\nimport javax.persistence.*;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport java.util.Vector;\r\nimport net.nodepad.model.*;\r\n\r\n@Entity\r\n@Table(name = "NodeUsers")\r\npublic class NodeUserEntity extends NodeUser {\r\n\r\n    public NodeUserEntity() {}\r\n\r\n    @Id\r\n    @GeneratedValue(generator = "uuid")\r\n    @GenericGenerator(name = "uuid", strategy = "uuid2")\r\n    @Column(name = "uuid", unique = true)\r\n    public String getId() {\r\n        return id;\r\n    }\r\n}\r\n', 'NodeUserEntity.java', 25, NULL, NULL),
(69, 'package com.theuniversalgraph.api.rest.repository;\r\n\r\nimport org.springframework.stereotype.Repository;\r\n\r\nimport org.springframework.data.jpa.repository.JpaRepository;\r\nimport org.springframework.stereotype.Repository;\r\nimport com.theuniversalgraph.api.rest.entity.NodeUserEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Repository\r\npublic interface NodeUserRepository extends JpaRepository<NodeUserEntity, String> {\r\n\r\n}', 'NodeUserRepository.java', 25, NULL, NULL),
(70, 'package com.theuniversalgraph.api.rest.service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport org.springframework.stereotype.Service;\r\nimport com.theuniversalgraph.api.rest.converter.NodeUserConverter;\r\nimport com.theuniversalgraph.api.rest.dto.NodeUserDto;\r\nimport com.theuniversalgraph.api.rest.entity.NodeUserEntity;\r\nimport com.theuniversalgraph.api.rest.repository.NodeUserRepository;\r\nimport net.nodepad.model.*;\r\n\r\nimport java.util.List;\r\n\r\n@Service\r\npublic class NodeUserService {\r\n\r\n    @Autowired\r\n    private NodeUserRepository nodeUserRepository;\r\n\r\n    @Autowired\r\n    private NodeUserConverter nodeUserConverter;\r\n\r\n        public List<NodeUserDto> getAllNodeUsers(){\r\n        return nodeUserConverter.toDto(nodeUserRepository.findAll());\r\n    }\r\n\r\n    public NodeUserDto getNodeUser(final String id){\r\n        return nodeUserConverter.toDto(nodeUserRepository.findOne(id));\r\n    }\r\n\r\n    public NodeUserDto createNodeUser(NodeUserDto nodeUserDto){\r\n        NodeUserEntity nodeUserEntity = nodeUserConverter.fromDto(nodeUserDto);\r\n        return nodeUserConverter.toDto(nodeUserRepository.save(nodeUserEntity));\r\n    }\r\n\r\n    public NodeUserDto updateNodeUser(String id, NodeUserDto nodeUserDto){\r\n        nodeUserRepository.delete(id);\r\n        NodeUserEntity nodeUserEntity = nodeUserConverter.fromDto(nodeUserDto);\r\n        return nodeUserConverter.toDto(nodeUserRepository.save(nodeUserEntity));\r\n    }\r\n\r\n    public void deleteNodeUser(String id){\r\n        nodeUserRepository.delete(id);\r\n    }\r\n}\r\n', 'NodeUserService.java', 25, NULL, NULL),
(80, 'package com.theuniversalgraph.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport com.theuniversalgraph.api.rest.dto.NodeUserDto;\r\nimport com.theuniversalgraph.api.rest.service.NodeUserService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/NodeUsers")\r\n@Api(value = "NodeUser API")\r\npublic class NodeUserResource {\r\n\r\n    @Autowired\r\n    private NodeUserService nodeUserService;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<NodeUserDto> getAllNodeUsers() {\r\n        return nodeUserService.getAllNodeUsers();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public NodeUserDto getNodeUser(@PathVariable final String id) {\r\n        return nodeUserService.getNodeUser(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<NodeUserDto> addNodeUser(@RequestBody final NodeUserDto nodeUser) {\r\n        NodeUserDto createdNodeUser = nodeUserService.createNodeUser(nodeUser);\r\n        return new ResponseEntity<>(createdNodeUser, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteNodeUser(@PathVariable final String id) {\r\n        nodeUserService.deleteNodeUser(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<NodeUserDto> updateNodeUser(@PathVariable final String id, @RequestBody final NodeUserDto nodeUser) {\r\n        NodeUserDto createdNodeUser = nodeUserService.updateNodeUser(id, nodeUser);\r\n        return new ResponseEntity<>(createdNodeUser, HttpStatus.OK);\r\n    }\r\n}\r\n', 'NodeUserResource.java', 25, NULL, NULL),
(72, 'package com.theuniversalgraph.api.rest.converter;\r\n\r\nimport org.springframework.stereotype.Service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport com.theuniversalgraph.api.rest.dto.NodeDto;\r\nimport com.theuniversalgraph.api.rest.entity.NodeEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Service\r\npublic class NodeConverter extends AbstractConverter<NodeEntity, NodeDto> {\r\n\r\n    @Override\r\n    public void toDto(final NodeEntity entity, final NodeDto dto) {\r\n        // convert NodeEntity to NodeDto\r\n\r\n    }\r\n\r\n    @Override\r\n    public void fromDto(final NodeEntity entity, final NodeDto dto) {\r\n        // convert NodeDto to NodeEntity\r\n}\r\n', 'NodeConverter.java', 3, NULL, NULL),
(73, 'package com.theuniversalgraph.api.rest.dto;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\n\r\nimport com.fasterxml.jackson.annotation.JsonProperty;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport net.nodepad.model.*;\r\n\r\npublic class NodeDto {\r\n\r\n    public NodeDto() {}\r\n\r\n    @JsonProperty("id")\r\n    public String id;\r\n}\r\n', 'NodeDto.java', 3, NULL, NULL),
(74, 'package com.theuniversalgraph.api.rest.entity;\r\n\r\nimport javax.persistence.GeneratedValue;\r\nimport org.hibernate.annotations.GenericGenerator;\r\nimport javax.persistence.*;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport java.util.Vector;\r\nimport net.nodepad.model.*;\r\n\r\n@Entity\r\n@Table(name = "Nodes")\r\npublic class NodeEntity extends Node {\r\n\r\n    public NodeEntity() {}\r\n\r\n    @Id\r\n    @GeneratedValue(generator = "uuid")\r\n    @GenericGenerator(name = "uuid", strategy = "uuid2")\r\n    @Column(name = "uuid", unique = true)\r\n    public String getId() {\r\n        return id;\r\n    }\r\n}\r\n', 'NodeEntity.java', 3, NULL, NULL),
(75, 'package com.theuniversalgraph.api.rest.repository;\r\n\r\nimport org.springframework.stereotype.Repository;\r\n\r\nimport org.springframework.data.jpa.repository.JpaRepository;\r\nimport org.springframework.stereotype.Repository;\r\nimport com.theuniversalgraph.api.rest.entity.NodeEntity;\r\nimport net.nodepad.model.*;\r\n\r\n@Repository\r\npublic interface NodeRepository extends JpaRepository<NodeEntity, String> {\r\n\r\n}', 'NodeRepository.java', 3, NULL, NULL),
(76, 'package com.theuniversalgraph.api.rest.service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport org.springframework.stereotype.Service;\r\nimport com.theuniversalgraph.api.rest.converter.NodeConverter;\r\nimport com.theuniversalgraph.api.rest.dto.NodeDto;\r\nimport com.theuniversalgraph.api.rest.entity.NodeEntity;\r\nimport com.theuniversalgraph.api.rest.repository.NodeRepository;\r\nimport net.nodepad.model.*;\r\n\r\nimport java.util.List;\r\n\r\n@Service\r\npublic class NodeService {\r\n\r\n    @Autowired\r\n    private NodeRepository nodeRepository;\r\n\r\n    @Autowired\r\n    private NodeConverter nodeConverter;\r\n\r\n        public List<NodeDto> getAllNodes(){\r\n        return nodeConverter.toDto(nodeRepository.findAll());\r\n    }\r\n\r\n    public NodeDto getNode(final String id){\r\n        return nodeConverter.toDto(nodeRepository.findOne(id));\r\n    }\r\n\r\n    public NodeDto createNode(NodeDto nodeDto){\r\n        NodeEntity nodeEntity = nodeConverter.fromDto(nodeDto);\r\n        return nodeConverter.toDto(nodeRepository.save(nodeEntity));\r\n    }\r\n\r\n    public NodeDto updateNode(String id, NodeDto nodeDto){\r\n        nodeRepository.delete(id);\r\n        NodeEntity nodeEntity = nodeConverter.fromDto(nodeDto);\r\n        return nodeConverter.toDto(nodeRepository.save(nodeEntity));\r\n    }\r\n\r\n    public void deleteNode(String id){\r\n        nodeRepository.delete(id);\r\n    }\r\n}\r\n', 'NodeService.java', 3, NULL, NULL),
(78, 'package com.theuniversalgraph.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport com.theuniversalgraph.api.rest.dto.NodeFieldDto;\r\nimport com.theuniversalgraph.api.rest.service.NodeFieldService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/NodeFields")\r\n@Api(value = "NodeField API")\r\npublic class NodeFieldResource {\r\n\r\n    @Autowired\r\n    private NodeFieldService nodeFieldService;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<NodeFieldDto> getAllNodeFields() {\r\n        return nodeFieldService.getAllNodeFields();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public NodeFieldDto getNodeField(@PathVariable final String id) {\r\n        return nodeFieldService.getNodeField(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<NodeFieldDto> addNodeField(@RequestBody final NodeFieldDto nodeField) {\r\n        NodeFieldDto createdNodeField = nodeFieldService.createNodeField(nodeField);\r\n        return new ResponseEntity<>(createdNodeField, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteNodeField(@PathVariable final String id) {\r\n        nodeFieldService.deleteNodeField(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<NodeFieldDto> updateNodeField(@PathVariable final String id, @RequestBody final NodeFieldDto nodeField) {\r\n        NodeFieldDto createdNodeField = nodeFieldService.updateNodeField(id, nodeField);\r\n        return new ResponseEntity<>(createdNodeField, HttpStatus.OK);\r\n    }\r\n}\r\n', 'NodeFieldResource.java', 19, NULL, NULL),
(79, 'package com.theuniversalgraph.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport com.theuniversalgraph.api.rest.dto.LinkUseDto;\r\nimport com.theuniversalgraph.api.rest.service.LinkUseService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/LinkUses")\r\n@Api(value = "LinkUse API")\r\npublic class LinkUseResource {\r\n\r\n    @Autowired\r\n    private LinkUseService linkUseService;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<LinkUseDto> getAllLinkUses() {\r\n        return linkUseService.getAllLinkUses();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public LinkUseDto getLinkUse(@PathVariable final String id) {\r\n        return linkUseService.getLinkUse(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<LinkUseDto> addLinkUse(@RequestBody final LinkUseDto linkUse) {\r\n        LinkUseDto createdLinkUse = linkUseService.createLinkUse(linkUse);\r\n        return new ResponseEntity<>(createdLinkUse, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteLinkUse(@PathVariable final String id) {\r\n        linkUseService.deleteLinkUse(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<LinkUseDto> updateLinkUse(@PathVariable final String id, @RequestBody final LinkUseDto linkUse) {\r\n        LinkUseDto createdLinkUse = linkUseService.updateLinkUse(id, linkUse);\r\n        return new ResponseEntity<>(createdLinkUse, HttpStatus.OK);\r\n    }\r\n}\r\n', 'LinkUseResource.java', 22, NULL, NULL),
(82, 'package com.theuniversalgraph.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport net.nodepad.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport com.theuniversalgraph.api.rest.dto.UserDto;\r\nimport com.theuniversalgraph.api.rest.service.UserService;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/Users")\r\n@Api(value = "User API")\r\npublic class UserResource {\r\n\r\n    @Autowired\r\n    private UserService userService;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<UserDto> getAllUsers() {\r\n        return userService.getAllUsers();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public UserDto getUser(@PathVariable final String id) {\r\n        return userService.getUser(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<UserDto> addUser(@RequestBody final UserDto user) {\r\n        UserDto createdUser = userService.createUser(user);\r\n        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity deleteUser(@PathVariable final String id) {\r\n        userService.deleteUser(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<UserDto> updateUser(@PathVariable final String id, @RequestBody final UserDto user) {\r\n        UserDto createdUser = userService.updateUser(id, user);\r\n        return new ResponseEntity<>(createdUser, HttpStatus.OK);\r\n    }\r\n}\r\n', 'UserResource.java', 21, NULL, NULL);

-- --------------------------------------------------------

--
-- テーブルの構造 `STRUTS_ACTION_TEMPLATE`
--

CREATE TABLE IF NOT EXISTS `STRUTS_ACTION_TEMPLATE` (
`ID` int(11) NOT NULL,
  `TEMPLATE` varchar(10000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `NAMETEMPLATE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `VERB_FK` int(11) NOT NULL,
  `TARGETEEACTION_FK` int(11) DEFAULT NULL,
  `JSP_TEMPLATE_FK` int(11) DEFAULT NULL
) ENGINE=MyISAM AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `STRUTS_ACTION_TEMPLATE`
--

INSERT INTO `STRUTS_ACTION_TEMPLATE` (`ID`, `TEMPLATE`, `NAMETEMPLATE`, `VERB_FK`, `TARGETEEACTION_FK`, `JSP_TEMPLATE_FK`) VALUES
(1, 'package ##packagename##;\r\n\r\nimport java.net.URL;\r\nimport java.util.Collection;\r\nimport java.util.Iterator;\r\nimport java.util.Vector;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.exception.DataException;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport de.nava.informa.core.ChannelIF;\r\nimport de.nava.informa.core.ItemIF;\r\nimport de.nava.informa.impl.basic.ChannelBuilder;\r\nimport de.nava.informa.parsers.FeedParser;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		String url = req.getParameter("url");\r\n        try {\r\n           URL url = new URL(url);\r\n           ChannelIF channel = FeedParser.parse(new ChannelBuilder(), url);\r\n           Collection items = channel.getItems();\r\n           channel = FeedParser.parse(new ChannelBuilder(), url);\r\n           items = channel.getItems();\r\n           Vector vector = new Vector();\r\n            \r\n           for (Iterator iter = items.iterator(); iter.hasNext();) {\r\n		ItemIF itemIF = (ItemIF) iter.next();\r\n\r\n		String textStr = itemIF.getDescription();\r\n	//	textStr = this.nl2br(textStr);\r\n		vector.add(textStr);\r\n	   }\r\n           req.setAttribute("outputs",vector);\r\n           req.setAttribute("rsstitle",item.getTitle().replaceAll("<[^>]*?>",""));\r\n        } catch (Exception e) {\r\n            e.printStackTrace();\r\n        }\r\n		return mapping.findForward("success");\r\n	}	\r\n}', 'RSSBlock', 1, NULL, 1),
(2, 'package ##packagename##;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		\r\n		BeanFactory factory = WebApplicationContextUtils\r\n				.getWebApplicationContext(this.getServlet().getServletContext());\r\n		SessionFactory sessionFactory = (SessionFactory) factory\r\n				.getBean("sessionFactory");\r\n		Session session = sessionFactory.openSession();\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n\r\n		if (req.getParameter("id") != null\r\n				&& !req.getParameter("id").equals("")) {\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n\r\n		} else if (req.getAttribute("id") != null\r\n				&& !req.getAttribute("id").equals("")) {\r\n			criteria.add(Restrictions.idEq(req.getAttribute("id")));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		}\r\n\r\n		req.setAttribute("##modelobj##",##modelobj##);\r\n		\r\n		\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', '##modelclass##Detail', 2, NULL, 3),
(3, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport java.io.File;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.enclosing.util.StringFullfiller;\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.Transaction;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		##modelclass##Form ##modelobj##form = (##modelclass##Form) form;\r\n		\r\n		\r\n		BeanUtils.copyProperties(##modelobj##,##modelobj##form);\r\n		StringFullfiller.fullfil(##modelobj##);\r\n		if(##modelobj##form.getId() == null || ##modelobj##form.getId().intValue() == 0){\r\n			##modelobj##.setId(null);\r\n		}else{\r\n			##modelobj##.setId(##modelobj##form.getId());\r\n		}\r\n		\r\n		BeanFactory factory = WebApplicationContextUtils\r\n				.getWebApplicationContext(this.getServlet().getServletContext());\r\n		SessionFactory sessionFactory = (SessionFactory) factory\r\n				.getBean("sessionFactory");\r\n		Session session = sessionFactory.openSession();\r\n		Transaction transaction = session.beginTransaction();\r\n		session.saveOrUpdate(##modelobj##);\r\n		transaction.commit();\r\n		session.flush();\r\n		sessionFactory.close();\r\n		\r\n		\r\n		req.setAttribute("id", ##modelobj##.getId());\r\n		return mapping.findForward("success");\r\n		\r\n	}\r\n	\r\n	\r\n}', '##modelclass##VP', 2, 4, NULL),
(4, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport java.util.Iterator;\r\nimport java.util.Vector;\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n\r\n\r\n		BeanFactory factory = WebApplicationContextUtils\r\n				.getWebApplicationContext(this.getServlet().getServletContext());\r\n		SessionFactory sessionFactory = (SessionFactory) factory\r\n				.getBean("sessionFactory");\r\n		Session session = sessionFactory.openSession();\r\n                Vector vector = new Vector();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {\r\n			##modelclass## ##modelobj## = (##modelclass##) iter.next();\r\n			vector.add(##modelobj##);\r\n		}\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		Criteria criteria2 = session.createCriteria(##modelclass##.class);\r\n\r\n		if (req.getParameter("id") != null\r\n				&& !req.getParameter("id").equals("")) {\r\n			criteria2.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			##modelobj## = (##modelclass##) criteria2.uniqueResult();\r\n\r\n		} else if (req.getAttribute("id") != null\r\n				&& !req.getAttribute("id").equals("")) {\r\n			criteria2.add(Restrictions.idEq(req.getAttribute("id")));\r\n			##modelobj## = (##modelclass##) criteria2.uniqueResult();\r\n		}\r\n\r\n		req.setAttribute("##modelobj##",##modelobj##);\r\n\r\n		\r\n		req.setAttribute("##modelobj##s",vector);\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', '##modelclass##s', 2, NULL, 2),
(5, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\n\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n\r\n\r\n		BeanFactory factory = WebApplicationContextUtils\r\n				.getWebApplicationContext(this.getServlet().getServletContext());\r\n		SessionFactory sessionFactory = (SessionFactory) factory\r\n				.getBean("sessionFactory");\r\n		Session session = sessionFactory.openSession();\r\n		Transaction transaction = session.beginTransaction();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));\r\n\r\n\r\n		##modelclass## ##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		session.delete(##modelobj##);\r\n		transaction.commit();\r\n		session.flush();\r\n		sessionFactory.close();\r\n\r\n		\r\n		\r\n		\r\n		\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', 'Delete##modelclass##', 2, 4, NULL),
(6, 'package ##packagename##;\r\n\r\nimport java.io.IOException;\r\nimport java.util.Date;\r\nimport java.util.Iterator;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport churchillobjects.rss4j.RssChannel;\r\nimport churchillobjects.rss4j.RssChannelItem;\r\nimport churchillobjects.rss4j.RssDocument;\r\nimport churchillobjects.rss4j.RssDublinCore;\r\nimport churchillobjects.rss4j.generator.RssGenerator;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n\r\n	        try{\r\n	        	RssDocument objRss=new RssDocument();\r\n	        	objRss.setVersion("1.0");\r\n\r\n\r\n 		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n	    		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n	    		criteria.add(Restrictions.idEq(req.getAttribute("id")));\r\n//	    		##secoundclass## ##secoundobj## = ##modelobj##.get##secoundclass##();\r\n	    			criteria = session.createCriteria(##modelclass##.class);\r\n//	    			criteria.addOrder(Order.desc("date"));\r\n//	    			criteria.add(Restrictions.eq("##secoundobj##", ##secoundobj##));\r\n	    			criteria.setMaxResults(30);\r\n	    			if(req.getParameter("q") !=null && !req.getParameter("q").equals("")){\r\n	    				criteria.add(Restrictions.like("##aiueo##","%" + new String(req.getParameter("q").getBytes("8859_1"), "UTF-8")  + "%"));\r\n	    			}\r\n\r\n	    			ChannelBuilder builder = new ChannelBuilder();\r\n	    			ChannelIF newChannel = builder.createChannel("##modelclass##s");\r\n	    			newChannel.setFormat(ChannelFormat.RSS_1_0);\r\n	    			newChannel.setLanguage("ja");\r\n	    			newChannel.setSite(new URL("http://"+req.getServerName()+req.getRequestURI()));\r\n	    			newChannel.setLocation(new URL("http://"+req.getServerName()+req.getRequestURI()));\r\n	    			newChannel.setDescription("##modelclass##s");\r\n\r\n\r\n	    			newChannel.setSite(new URL("http://"+req.getServerName()+req.getRequestURI()));\r\n	    			newChannel.setLocation(new URL("http://"+req.getServerName()+req.getRequestURI()));\r\n		        	newChannel.setDescription("##modelclass##s");\r\n	    			for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {\r\n	    				##modelclass## ##modelobj## = (##modelclass##)iter.next();\r\n					ItemIF item = new Item();\r\n					//item.setDate(new Date());\r\n\r\n	    				item.setTitle(##modelobj##.getName());\r\n	    				item.setLink(new URL("http://"+req.getServerName()+req.getRequestURI());\r\n	    				item.setDescription(##modelobj##.getName());\r\n		    			newChannel.addItem(item);\r\n	    			}\r\n	    			StringWriter stringWriter = new StringWriter();\r\n	    			res.setContentType("text/xml;charset=utf-8");\r\n	    			res.setCharacterEncoding("utf-8");\r\n	    			RSS_1_0_Exporter writer = new RSS_1_0_Exporter(stringWriter,"utf-8");\r\n	    			writer.write(newChannel);\r\n	    			res.getWriter().write(stringWriter.toString());\r\n		    			\r\n	    			PrintWriter printWriter = new PrintWriter(new File(this.getServlet().getServletContext().getRealPath("##modelclass##RssExport.xml")),"utf-8");\r\n	    			printWriter.write(stringWriter.toString());\r\n\r\n	    			session.flush();\r\n\r\n	        }catch(IOException e){\r\n	            System.out.println(e.toString());\r\n	        }finally{\r\n	        }\r\n\r\n\r\n\r\n        \r\n		return mapping.findForward("success");\r\n	}\r\n    public String url2link(String string){\r\n    	return string.replaceAll("(http://|https://){1}[\\\\w\\\\.\\\\-/:]+","<a href=''$0''>$0</a>");\r\n    }\r\n    public String nl2br(String string){\r\n    	string = string.replaceAll("\\\\n","<br />");\r\n    	return string.replaceAll("\\\\n","<br />");\r\n    	\r\n    }\r\n\r\n\r\n	\r\n}', 'RSSExport##modelclass##', 3, NULL, NULL),
(7, 'package ##packagename##;\r\n\r\nimport java.net.URL;\r\nimport java.util.Enumeration;\r\n\r\nimport java.util.Collection;\r\nimport java.util.Iterator;\r\nimport java.util.Vector;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\nimport net.enclosing.util.StringFullfiller;\r\n\r\n\r\nimport org.apache.commons.httpclient.HttpClient;\r\nimport org.apache.commons.httpclient.methods.GetMethod;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport churchillobjects.rss4j.RssChannel;\r\nimport churchillobjects.rss4j.RssChannelItem;\r\nimport churchillobjects.rss4j.RssDocument;\r\nimport churchillobjects.rss4j.parser.RssParser;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		String urlstr = req.getParameter("url");\r\n        try {\r\n           URL url = new URL(urlstr);\r\n		HttpClient client = new HttpClient();\r\n		GetMethod method = new GetMethod(url.toString());\r\n		client.executeMethod(method);\r\n\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		RssDocument doc = RssParser.parseRss(method.getResponseBodyAsString());\r\n		Enumeration enumeration = doc.channels();\r\n		while(enumeration.hasMoreElements()){\r\n	            RssChannel channel = (RssChannel)enumeration.nextElement();\r\n                    Criteria criteria = session.createCriteria(##modelclass##.class);\r\n//                    criteria.add(Restrictions.eq("##uniqattribute##",new String(item.getItemLink())));\r\n                    if(criteria.list().size() == 0){\r\n                        System.out.println("Channel: "+channel.getChannelTitle());\r\n                        Enumeration items = channel.items();\r\n                        while(items.hasMoreElements()){\r\n                           RssChannelItem item = (RssChannelItem) items.nextElement();\r\n                           ##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n                           ##modelobj##.setContent(item.getItemDescription());\r\n                           ##modelobj##.setTitle(item.getItemTitle());\r\n                           //	##EDITSNIP## textStr = this.nl2br(textStr);\r\n                           StringFullfiller.fullfil(##modelobj##);\r\n                           Transaction transaction = session.beginTransaction();\r\n                           session.saveOrUpdate(##modelobj##);\r\n                           transaction.commit();\r\n                        }\r\n                    }\r\n                }\r\n		session.flush();\r\n\r\n\r\n        } catch (Exception e) {\r\n            e.printStackTrace();\r\n        }\r\n		return mapping.findForward("success");\r\n	}	\r\n}', 'RssImport##modelclass##', 4, NULL, NULL),
(8, 'package ##packagename##;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n\r\n		if (req.getParameter("id") != null\r\n				&& !req.getParameter("id").equals("")) {\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n\r\n		} else if (req.getAttribute("id") != null\r\n				&& !req.getAttribute("id").equals("")) {\r\n			criteria.add(Restrictions.idEq(req.getAttribute("id")));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		}\r\n\r\n		req.setAttribute("##modelobj##",##modelobj##);\r\n		\r\n		\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', '##modelclass##Detail', 6, NULL, NULL),
(9, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport java.io.File;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.enclosing.util.StringFullfiller;\r\nimport net.enclosing.util.HTTPGetRedirection;\r\nimport net.enclosing.util.HibernateSession;\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.commons.lang.StringUtils;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		##modelclass##Form ##modelobj##form = (##modelclass##Form) form;\r\n		\r\n                ##relationvpcode##\r\n		\r\n		BeanUtils.copyProperties(##modelobj##,##modelobj##form);\r\n		StringFullfiller.fullfil(##modelobj##);\r\n		if(##modelobj##form.getId() == null || ##modelobj##form.getId().intValue() == 0){\r\n			##modelobj##.setId(null);\r\n		}else{\r\n			##modelobj##.setId(##modelobj##form.getId());\r\n		}\r\n\r\n		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());\r\n		\r\n                ##relationvpsecoundcode##\r\n\r\n		Transaction transaction = session.beginTransaction();\r\n		session.saveOrUpdate(##modelobj##);\r\n		transaction.commit();\r\n		session.flush();\r\n		\r\n		new HTTPGetRedirection(req, res, "##modelclass##Detail.do", ##modelobj##.getId().toString());\r\n		return null;\r\n\r\n		\r\n	}\r\n	\r\n	\r\n}', '##modelclass##VP', 6, NULL, NULL),
(10, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport java.util.Iterator;\r\nimport java.util.Vector;\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\n\r\nimport net.enclosing.util.HibernateSession;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n\r\n\r\n\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n                Vector vector = new Vector();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {\r\n			##modelclass## ##modelobj## = (##modelclass##) iter.next();\r\n			vector.add(##modelobj##);\r\n		}\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		Criteria criteria2 = session.createCriteria(##modelclass##.class);\r\n\r\n		if (req.getParameter("id") != null\r\n				&& !req.getParameter("id").equals("")) {\r\n			criteria2.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			##modelobj## = (##modelclass##) criteria2.uniqueResult();\r\n\r\n		} else if (req.getAttribute("id") != null\r\n				&& !req.getAttribute("id").equals("")) {\r\n			criteria2.add(Restrictions.idEq(req.getAttribute("id")));\r\n			##modelobj## = (##modelclass##) criteria2.uniqueResult();\r\n		}\r\n\r\n		req.setAttribute("##modelobj##",##modelobj##);\r\n\r\n		\r\n		req.setAttribute("##modelobj##s",vector);\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', '##modelclass##s', 6, NULL, 4),
(11, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\n\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\n\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n\r\n\r\n\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n		Transaction transaction = session.beginTransaction();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));\r\n\r\n\r\n		##modelclass## ##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		session.delete(##modelobj##);\r\n		transaction.commit();\r\n		session.flush();\r\n\r\n\r\n		\r\n		\r\n		\r\n		\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', 'Delete##modelclass##', 6, 10, NULL),
(12, 'package ##packagename##;\r\n\r\nimport java.io.IOException;\r\nimport java.util.Date;\r\nimport java.util.Iterator;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport churchillobjects.rss4j.RssChannel;\r\nimport churchillobjects.rss4j.RssChannelItem;\r\nimport churchillobjects.rss4j.RssDocument;\r\nimport churchillobjects.rss4j.RssDublinCore;\r\nimport churchillobjects.rss4j.generator.RssGenerator;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n\r\n	        try{\r\n	        	RssDocument objRss=new RssDocument();\r\n	        	objRss.setVersion("1.0");\r\n\r\n\r\n 		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n	    		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n	    		criteria.add(Restrictions.idEq(req.getAttribute("id")));\r\n//	    		##secoundclass## ##secoundobj## = ##modelobj##.get##secoundclass##();\r\n	    			criteria = session.createCriteria(##modelclass##.class);\r\n//	    			criteria.addOrder(Order.desc("date"));\r\n//	    			criteria.add(Restrictions.eq("##secoundobj##", ##secoundobj##));\r\n	    			criteria.setMaxResults(30);\r\n	    			if(req.getParameter("q") !=null && !req.getParameter("q").equals("")){\r\n	    				criteria.add(Restrictions.like("##aiueo##","%" + new String(req.getParameter("q").getBytes("8859_1"), "UTF-8")  + "%"));\r\n	    			}\r\n\r\n	    			ChannelBuilder builder = new ChannelBuilder();\r\n	    			ChannelIF newChannel = builder.createChannel("##modelclass##s");\r\n	    			newChannel.setFormat(ChannelFormat.RSS_1_0);\r\n	    			newChannel.setLanguage("ja");\r\n	    			newChannel.setSite(new URL("http://"+req.getServerName()+req.getRequestURI()));\r\n	    			newChannel.setLocation(new URL("http://"+req.getServerName()+req.getRequestURI()));\r\n	    			newChannel.setDescription("##modelclass##s");\r\n\r\n\r\n	    			newChannel.setSite(new URL("http://"+req.getServerName()+req.getRequestURI()));\r\n	    			newChannel.setLocation(new URL("http://"+req.getServerName()+req.getRequestURI()));\r\n		        	newChannel.setDescription("##modelclass##s");\r\n	    			for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {\r\n	    				##modelclass## ##modelobj## = (##modelclass##)iter.next();\r\n					ItemIF item = new Item();\r\n					//item.setDate(new Date());\r\n\r\n	    				item.setTitle(##modelobj##.getName());\r\n	    				item.setLink(new URL("http://"+req.getServerName()+req.getRequestURI());\r\n	    				item.setDescription(##modelobj##.getName());\r\n		    			newChannel.addItem(item);\r\n	    			}\r\n	    			StringWriter stringWriter = new StringWriter();\r\n	    			res.setContentType("text/xml;charset=utf-8");\r\n	    			res.setCharacterEncoding("utf-8");\r\n	    			RSS_1_0_Exporter writer = new RSS_1_0_Exporter(stringWriter,"utf-8");\r\n	    			writer.write(newChannel);\r\n	    			res.getWriter().write(stringWriter.toString());\r\n		    			\r\n	    			PrintWriter printWriter = new PrintWriter(new File(this.getServlet().getServletContext().getRealPath("##modelclass##RssExport.xml")),"utf-8");\r\n	    			printWriter.write(stringWriter.toString());\r\n\r\n	    			session.flush();\r\n\r\n	        }catch(IOException e){\r\n	            System.out.println(e.toString());\r\n	        }finally{\r\n	        }\r\n\r\n\r\n\r\n        \r\n		return mapping.findForward("success");\r\n	}\r\n    public String url2link(String string){\r\n    	return string.replaceAll("(http://|https://){1}[\\\\w\\\\.\\\\-/:]+","<a href=''$0''>$0</a>");\r\n    }\r\n    public String nl2br(String string){\r\n    	string = string.replaceAll("\\\\n","<br />");\r\n    	return string.replaceAll("\\\\n","<br />");\r\n    	\r\n    }\r\n\r\n\r\n	\r\n}', '##modelclass##RSSExport', 6, NULL, NULL),
(13, 'package ##packagename##;\r\n\r\nimport java.net.URL;\r\nimport java.util.Collection;\r\nimport java.util.Iterator;\r\nimport java.util.Vector;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport org.apache.commons.httpclient.HttpClient;\r\nimport org.apache.commons.httpclient.methods.GetMethod;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport churchillobjects.rss4j.RssChannel;\r\nimport churchillobjects.rss4j.RssChannelItem;\r\nimport churchillobjects.rss4j.RssDocument;\r\nimport churchillobjects.rss4j.parser.RssParser;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\n\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		String urlstr = req.getParameter("url");\r\n        try {\r\n           URL url = new URL(urlstr);\r\n		HttpClient client = new HttpClient();\r\n       		URL url = new URL(urlstr);\r\n		GetMethod method = new GetMethod(url.toString());\r\n		client.executeMethod(method);\r\n\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		RssDocument doc = RssParser.parseRss(method.getResponseBodyAsString());\r\n		Enumeration enum = doc.channels();\r\n		while(enum.hasMoreElements()){\r\n		  RssChannel channel = (RssChannel)enum.nextElement();\r\n		  System.out.println("Channel: "+channel.getChannelTitle());\r\n		  Enumeration items = channel.items();\r\n		  while(items.hasMoreElements()){\r\n                  	RssChannelItem item = (RssChannelItem) items.nextElement();	     		                ##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n			##modelobj##.setContent(item.getItemDescription());\r\n			##modelobj##.setTitle(itemIf.getItemTitle());\r\n		//	##EDITSNIP## textStr = this.nl2br(textStr);\r\n			StringFullfiller.fullfil(##modelobj##);\r\n			Transaction transaction = session.beginTransaction();\r\n			session.saveOrUpdate(##modelobj##);\r\n			transaction.commit();\r\n		  }\r\n		session.flush();\r\n\r\n\r\n        } catch (Exception e) {\r\n            e.printStackTrace();\r\n        }\r\n		return mapping.findForward("success");\r\n	}	\r\n}', '##modelclass##InputRss', 6, NULL, NULL),
(14, 'package ##packagename##;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\n\r\nimport net.enclosing.util.HibernateSession;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		\r\n\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n\r\n		for (int I = 0; I < req.getParameterValues("id").length; i++) {\r\n			Criteria criteria2 = session.createCriteria(##modelclass##.class);\r\n			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameterValues("id")[i])));\r\n			##modelclass## ##modelobj## = (##modelclass##)criteria2.uniqueResult();\r\n			##modelobj##.set##attr##(true);\r\n			session.save(##modelobj##);\r\n		}\r\n		transaction.commit();\r\n		session.flush();\r\n\r\n		\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', 'SetSelectionOf##modelclass####attr##', 6, 10, NULL),
(15, 'package ##packagename##;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Transaction;\r\n\r\nimport org.hibernate.Session;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\nimport net.enclosing.util.HTTPGetRedirection;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		\r\n\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		Transaction transaction = session.beginTransaction();\r\n\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));\r\n		##modelclass## ##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		##modelobj##.set##Attr##(true);\r\n		session.saveOrUpdate(##modelobj##);\r\n		transaction.commit();\r\n		session.flush();\r\n\r\n\r\n		new HTTPGetRedirection(req, res, "##modelclass##s.do", ##modelobj##.getId().toString());\r\n		return null;\r\n\r\n		\r\n	}\r\n	\r\n	\r\n}', 'Set##modelclass####Attr##', 6, 10, NULL),
(16, 'package ##packagename##;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\nimport net.enclosing.util.HTTPGetRedirection;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		Transaction transaction = session.beginTransaction();\r\n\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));\r\n		##modelclass## ##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		##modelobj##.set##Attr##(false);\r\n		session.saveOrUpdate(##modelobj##);\r\n		transaction.commit();\r\n		session.flush();\r\n\r\n\r\n		new HTTPGetRedirection(req, res, "##modelclass##s.do", ##modelobj##.getId().toString());\r\n		return null;\r\n	}\r\n	\r\n	\r\n}', 'Set##modelclass##Non##attr##', 6, 10, NULL),
(17, 'package ##packagename##;\r\n\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\n\r\nimport net.enclosing.util.HibernateSession;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n		Transaction transaction = session.beginTransaction();\r\n\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));\r\n		##modelclass## ##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		##modelclass## ##modelobj##2 = new ##modelclass##Impl();\r\n		BeanUtils.copyProperties(##modelobj##2,##modelobj##);\r\n                ##modelobj##2.setId(null);\r\n		//##modelobj##2.setSomething(null);\r\n		session.saveOrUpdate(##modelobj##2);\r\n		transaction.commit();\r\n		session.flush();\r\n\r\n		req.setAttribute("id", ##modelobj##2.getId());\r\n		\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', 'CopyA##modelclass##FromA##modelclass##', 6, 10, NULL),
(18, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport java.awt.font.NumericShaper;\r\nimport java.io.IOException;\r\nimport java.io.OutputStream;\r\nimport java.util.Iterator;\r\nimport java.util.Locale;\r\nimport java.util.Vector;\r\n\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.criterion.Order;\r\n\r\nimport jxl.Workbook;\r\nimport jxl.WorkbookSettings;\r\nimport jxl.write.Label;\r\nimport jxl.write.Number;\r\nimport jxl.write.WritableSheet;\r\nimport jxl.write.WritableWorkbook;\r\nimport net.pmcsm.model.Componey;\r\nimport net.pmcsm.model.Manual;\r\nimport net.pmcsm.model.Outsourcing;\r\n\r\n\r\npublic class ##nameofsentence##{\r\n	public ##nameofsentence##(Vector vector,OutputStream outputStream,Session session){\r\n\r\n        try{\r\n        	WorkbookSettings ws = new WorkbookSettings();\r\n\r\n        	ws.setLocale(new Locale("ja", "JP"));\r\n        	ws.setEncoding("Windows-31J");\r\n        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);\r\n        	WritableSheet sheet = workbook.createSheet("sheet", 0);\r\n        	ws.setGCDisabled(true);\r\n        	\r\n                int x = 0;\r\n                sheet.addCell(new Label(x++, 0, "1"));\r\n        	sheet.addCell(new Label(x++, 0, "2"));\r\n        	sheet.addCell(new Label(x++, 0, "3"));\r\n        	sheet.addCell(new Label(x++, 0, "4"));\r\n        	sheet.addCell(new Label(x++, 0, "5"));\r\n        	sheet.addCell(new Label(x++, 0, "6"));\r\n        	sheet.addCell(new Label(x++, 0, "7"));\r\n        	sheet.addCell(new Label(x++, 0, "8"));\r\n        	sheet.addCell(new Label(x++, 0, "9"));\r\n        	sheet.addCell(new Label(x++, 0, "10"));\r\n\r\n\r\n\r\n\r\n\r\n\r\n        	x = 0;\r\n        	int y= 1;\r\n    		for (Iterator iter = vector.iterator(); iter.hasNext();) {\r\n    			##modelclass## ##modelobj## = (##modelclass##) iter.next();\r\n    			sheet.addCell(new Label(x++, y, ##modelobj##.get().getTypename()));\r\n    			sheet.addCell(new Label(x++, y, ##modelobj##.get().getModelcode()));\r\n    			sheet.addCell(new Label(x++, y, ##modelobj##.get().getShimuke()));\r\n    			sheet.addCell(new Label(x++, y, ##modelobj##.get().getName()));\r\n    			sheet.addCell(new Number(x++, y, ##modelobj##.get()));\r\n    			sheet.addCell(new Number(x++, y, ##modelobj##.get()));\r\n    			sheet.addCell(new Label(x++, y, String.valueOf(true)));\r\n    			sheet.addCell(new Label(x++, y, String.valueOf(true)));\r\n    			sheet.addCell(new Label(x++, y, String.valueOf(true)));\r\n    			i++;\r\n    		}\r\n        	\r\n        	workbook.write();\r\n        	workbook.close();\r\n		\r\n        }catch(Exception e){\r\n            System.out.println(e.toString());\r\n        }finally{\r\n        }\r\n	}\r\n	\r\n\r\n\r\n}', 'XlsExportOf##modelclass##', 6, NULL, NULL),
(20, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\n\r\nimport java.io.BufferedInputStream;\r\nimport java.io.BufferedOutputStream;\r\nimport java.io.FileOutputStream;\r\nimport java.io.InputStream;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.enclosing.util.HTTPGetRedirection;\r\nimport net.enclosing.util.StringFullfiller;\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.apache.struts.upload.FormFile;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		##modelclass##Bean ##modelobj##form = (##modelclass##Bean) form;\r\n		\r\n		///////////////////////validation for file names jpgかJPGかJPEGじゃないなら\r\n		if(! (##modelobj##form.getFile().getFileName().endsWith(".jpg") || ##modelobj##form.getFile().getFileName().endsWith(".JPG") || ##modelobj##form.getFile().getFileName().endsWith(".JPEG") )){\r\n			req.getSession().setAttribute("systemmessage","画像はJPEG画像のみアップロード可能です。\\\\\\");\r\n//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", ##modelobj##form.get##addingtoclass##().toString());\r\n			req.setAttribute("id",##modelobj##form.get##addingtoclass##());\r\n			return mapping.findForward("error");\r\n		}\r\n		\r\n		Integer ##addingtoclass##Int = ##modelobj##form.get##addingtoclass##();\r\n		##modelobj##form.set##addingtoclass##(null);\r\n		\r\n		BeanUtils.copyProperties(##modelobj##,##modelobj##form);\r\n		StringFullfiller.fullfil(##modelobj##);\r\n		if(##modelobj##form.getId() == null || ##modelobj##form.getId().intValue() == 0){\r\n			##modelobj##.setId(null);\r\n		}else{\r\n			##modelobj##.setId(##modelobj##form.getId());\r\n		}\r\n		##modelobj##.setSetnumber(Integer.parseInt(req.getParameter("setnumber")));\r\n		\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n		Criteria criteria2 = session.createCriteria(##addingtoclass##.class);\r\n		criteria2.add(Restrictions.idEq(##addingtoclass##Int));\r\n		##addingtoclass## ##addingtoobj## = (##addingtoclass##) criteria2\r\n				.uniqueResult();\r\n		##modelobj##.set##addingtoclass##(##addingtoobj##);\r\n\r\n		\r\n		Transaction transaction = session.beginTransaction();\r\n		session.saveOrUpdate(##modelobj##);\r\n		transaction.commit();\r\n		session.flush();\r\n		sessionFactory.close();\r\n		\r\n\r\n		///////////////////putting file to upload\r\n		FormFile file = ##modelobj##form.getFile();\r\n		String filename = ##modelobj##.getId().toString() +".jpg";\r\n		\r\n		InputStream is = file.getInputStream();\r\n		String basepath = 		this.getServlet().getServletContext().getRealPath("upload");\r\n\r\n		\r\n		BufferedInputStream inBuffer = new BufferedInputStream(is);\r\n		FileOutputStream fos = new FileOutputStream(basepath + "/" + filename);\r\n		BufferedOutputStream outBuffer = new BufferedOutputStream(fos);\r\n		int contents = 0;\r\n		while ((contents = inBuffer.read()) != -1) {\r\n			outBuffer.write(contents);\r\n		}\r\n		outBuffer.flush();\r\n		inBuffer.close();\r\n		outBuffer.close();\r\n		\r\n		\r\n		new HTTPGetRedirection(req, res, "##addingtoclass##Detail.do", ##addingtoclass##Int.toString());\r\n		return null;\r\n//		req.setAttribute("id", ##modelobj##.getId());\r\n//		return mapping.findForward("success");\r\n		\r\n	}\r\n	\r\n	\r\n}', '##modelclass##FormFileUploadAddingTo##addingtoclass##', 7, NULL, NULL);
INSERT INTO `STRUTS_ACTION_TEMPLATE` (`ID`, `TEMPLATE`, `NAMETEMPLATE`, `VERB_FK`, `TARGETEEACTION_FK`, `JSP_TEMPLATE_FK`) VALUES
(19, 'package ##packagename##;\r\n\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\nimport net.enclosing.util.HibernateSession;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n	    	if(req.getParameter("q") !=null && !req.getParameter("q").equals("")){\r\n	    	   criteria.add(Restrictions.like("##attr##","%" + new String(req.getParameter("q").getBytes("8859_1"), "UTF-8")  + "%"));\r\n	  	}\r\n		session.flush();\r\n		req.setAttribute("intrausers", criteria.list());\r\n		req.setAttribute("from","Grep##modelclass##On##Attr##");\r\n		return mapping.findForward("success");\r\n	}\r\n}', 'Grep##modelclass##On##attr##', 6, NULL, 4),
(21, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##beanpackage##;\r\n\r\nimport java.io.File;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.enclosing.util.StringFullfiller;\r\nimport net.enclosing.util.HTTPGetRedirection;\r\nimport net.enclosing.util.HibernateSession;\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.commons.lang.StringUtils;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		##modelclass##Form ##modelobj##form = (##modelclass##Form) form;\r\n\r\n                ##validation##\r\n\r\n                ##relationvpcode##\r\n		\r\n		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());\r\n		if(##modelobj##form.getId() == null || ##modelobj##form.getId().intValue() == 0){\r\n			##modelobj##.setId(null);\r\n			##modelobj##form.setId(null);\r\n		}else{\r\n			##modelobj##.setId(##modelobj##form.getId());\r\n			Criteria criteria = session.createCriteria(##modelclass##.class);\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n\r\n		}\r\n                ##copyattrsatvp##\r\n\r\n		\r\n		StringFullfiller.fullfil(##modelobj##);\r\n                ##relationvpsecoundcode##\r\n\r\n		Transaction transaction = session.beginTransaction();\r\n		session.saveOrUpdate(##modelobj##);\r\n		transaction.commit();\r\n		session.flush();\r\nif(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){\r\n		new HTTPGetRedirection(req, res, "Post##modelclass##Detail.do", ##modelobj##.getId().toString());\r\n\r\n}\r\n		\r\n		new HTTPGetRedirection(req, res, "##modelclass##s.do", ##modelobj##.getId().toString());\r\n		return null;\r\n\r\n		\r\n	}\r\n	\r\n	\r\n}', 'Post##modelclass##VP', 8, NULL, NULL),
(22, 'package ##packagename##;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\nimport net.storyteller.desktop.CopyProperties;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		##modelclass##Form ##modelobj##form = new ##modelclass##Form();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n\r\n		if (req.getAttribute("form")== null && req.getParameter("id")!=null){\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n			new CopyProperties(##modelobj##,##modelobj##form);\r\n		} else if(req.getAttribute("form")!=null){\r\n                        ##modelobj##form = (##modelclass##Form)req.getAttribute("form");\r\n			criteria.add(Restrictions.idEq(##modelobj##form.getId()));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		}\r\n		\r\n\r\n		req.setAttribute("model",##modelobj##);\r\n		req.setAttribute("form",##modelobj##form);\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', 'Post##modelclass##Detail', 8, NULL, 6),
(23, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport java.util.Iterator;\r\nimport java.util.Vector;\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\n\r\nimport net.enclosing.util.HibernateSession;\r\nimport net.storyteller.desktop.CopyProperties;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n\r\n\r\n\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n                Vector vector = new Vector();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {\r\n			##modelclass## ##modelobj## = (##modelclass##) iter.next();\r\n			vector.add(##modelobj##);\r\n		}\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		##modelclass##Form ##modelobj##form = new ##modelclass##Form();\r\n		criteria = session.createCriteria(##modelclass##.class);\r\n\r\n\r\n		if (req.getAttribute("form")== null && req.getParameter("id")!=null){\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n			new CopyProperties(##modelobj##,##modelobj##form);\r\n		} else if(req.getAttribute("form")!=null){\r\n                        ##modelobj##form = (##modelclass##Form)req.getAttribute("form");\r\n			criteria.add(Restrictions.idEq(##modelobj##form.getId()));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		}\r\n		\r\n\r\n		req.setAttribute("model",##modelobj##);\r\n		req.setAttribute("form",##modelobj##form);\r\n		\r\n		\r\n		req.setAttribute("##modelobj##s",vector);\r\n		\r\n\r\n                if(req.getParameter("displayexport") !=null){\r\n     		    return mapping.findForward("displayexport");\r\n                }\r\n\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', '##modelclass##s', 9, NULL, 7),
(24, 'package ##packagename##;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n\r\n		if (req.getParameter("id") != null\r\n				&& !req.getParameter("id").equals("")) {\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n\r\n		} else if (req.getAttribute("id") != null\r\n				&& !req.getAttribute("id").equals("")) {\r\n			criteria.add(Restrictions.idEq(req.getAttribute("id")));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		}\r\n\r\n		req.setAttribute("##modelobj##",##modelobj##);\r\n		\r\n		\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', 'Show##modelclass##', 10, NULL, 8),
(25, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##beanpackage##;\r\n\r\n\r\nimport java.io.BufferedInputStream;\r\nimport java.io.BufferedOutputStream;\r\nimport java.io.FileOutputStream;\r\nimport java.io.InputStream;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.enclosing.util.HTTPGetRedirection;\r\nimport net.enclosing.util.StringFullfiller;\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.apache.struts.upload.FormFile;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		##modelclass##Form ##modelobj##form = (##modelclass##Form) form;\r\n		\r\n		///////////////////////validation for file names jpgかJPGかJPEGじゃないなら\r\n		if(! (##modelobj##form.getFormFile().getFileName().endsWith(".jpg") || ##modelobj##form.getFormFile().getFileName().endsWith(".JPG") || ##modelobj##form.getFormFile().getFileName().endsWith(".JPEG") )){\r\n			req.getSession().setAttribute("systemmessage","jpg only");\r\n//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", ##modelobj##form.get##addingtoclass##().toString());\r\n			req.setAttribute("id",##modelobj##form.get##addingtoclass##());\r\n			return mapping.findForward("error");\r\n		}\r\n		\r\n               	Integer ##addingtoclass##Int = ##modelobj##form.get##addingtoclass##();\r\n		##modelobj##form.set##addingtoclass##(null);\r\n\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n		Criteria criteria2 = session.createCriteria(##addingtoclass##.class);\r\n		criteria2.add(Restrictions.idEq(##addingtoclass##Int));\r\n		##addingtoclass## ##addingtoobj## = (##addingtoclass##) criteria2\r\n				.uniqueResult();\r\n\r\n                ##modelclass## prevobj = ##addingtoobj##.get##modelclass##();\r\n\r\n                if(prevobj!=null){\r\n                   prevobj.set##addingtoclass##(null);\r\n		Transaction transaction = session.beginTransaction();\r\n		session.delete(prevobj);\r\n		transaction.commit();\r\n                }\r\n				\r\n\r\n\r\n		BeanUtils.copyProperties(##modelobj##,##modelobj##form);\r\n		StringFullfiller.fullfil(##modelobj##);\r\n		\r\n		if(##modelobj##form.getId() == null || ##modelobj##form.getId().intValue() == 0){\r\n			##modelobj##.setId(null);\r\n                ##modelobj##.setId(null);\r\n\r\n		##modelobj##.set##addingtoclass##(##addingtoobj##);\r\n		##addingtoobj##.set##modelclass##(##modelobj##);\r\n\r\n		session.flush();\r\n		Transaction transaction = session.beginTransaction();\r\n		session.saveOrUpdate(##modelobj##);\r\n		session.saveOrUpdate(##addingtoobj##);\r\n		transaction.commit();\r\n		session.flush();\r\n		}                \r\n		\r\n\r\n\r\n		\r\n\r\n		///////////////////putting file to upload\r\n		FormFile file = ##modelobj##form.getFormFile();\r\n		String filename = ##modelobj##.getId().toString() +".jpg";\r\n		\r\n		InputStream is = file.getInputStream();\r\n		String basepath = 		this.getServlet().getServletContext().getRealPath("upload");\r\n\r\n		\r\n		BufferedInputStream inBuffer = new BufferedInputStream(is);\r\n		FileOutputStream fos = new FileOutputStream(basepath + "/" + filename);\r\n		BufferedOutputStream outBuffer = new BufferedOutputStream(fos);\r\n		int contents = 0;\r\n		while ((contents = inBuffer.read()) != -1) {\r\n			outBuffer.write(contents);\r\n		}\r\n		outBuffer.flush();\r\n		inBuffer.close();\r\n		outBuffer.close();\r\n		\r\n		\r\n		new HTTPGetRedirection(req, res, "##addingtoclass##Detail.do", ##addingtoclass##Int.toString());\r\n		return null;\r\n//		req.setAttribute("id", ##modelobj##.getId());\r\n//		return mapping.findForward("success");\r\n		\r\n	}\r\n	\r\n	\r\n}', '##modelclass##FormFileUploadAddingTo##addingtoclass##', 11, NULL, NULL),
(26, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\n\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.enclosing.util.HTTPGetRedirection;\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\n\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n\r\n\r\n\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n		Transaction transaction = session.beginTransaction();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));\r\n\r\n\r\n		##modelclass## ##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		session.delete(##modelobj##);\r\n		transaction.commit();\r\n		session.flush();\r\n\r\n\r\n		\r\n				new HTTPGetRedirection(req, res, "##modelclass##s.do", ##modelobj##.getId().toString());\r\n		return null;\r\n\r\n	}\r\n	\r\n	\r\n}', 'Delete##modelclass##', 14, NULL, NULL),
(27, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##beanpackage##;\r\n\r\nimport java.io.File;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.enclosing.util.StringFullfiller;\r\nimport net.enclosing.util.HTTPGetRedirection;\r\nimport net.enclosing.util.HibernateSession;\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.commons.lang.StringUtils;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n\r\n\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		##modelclass##Form ##modelobj##form = new ##modelclass##Form();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n\r\n		if (req.getAttribute("form")== null && req.getParameter("id")!=null){\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n			new CopyProperties(##modelobj##,##modelobj##form);\r\n		} else if(req.getAttribute("form")!=null){\r\n                        ##modelobj##form = (##modelclass##Form)req.getAttribute("form");\r\n			criteria.add(Restrictions.idEq(##modelobj##form.getId()));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		}\r\n                   \r\n                   \r\n		\r\n\r\n\r\n\r\n	}\r\n}', 'Update##modelclass##From##secoundmodelclass##', 15, NULL, NULL),
(28, 'package ##packagename##;\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\n\r\nimport java.util.Calendar;\r\n\r\nimport javax.servlet.http.Cookie;\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.enclosing.util.HTTPGetRedirection;\r\nimport net.pmcsm.model.IntraUser;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport filters.pmcsm.HibernateSession;\r\n\r\npublic class LoginAction extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());\r\n\r\n		\r\n		IntraUserForm intraUserForm = (IntraUserForm)form;\r\n\r\n\r\n		Criteria criteria = session.createCriteria(IntraUser.class);\r\n		criteria.add(Restrictions.eq("account",intraUserForm.getAccount()));\r\n		criteria.add(Restrictions.eq("password",intraUserForm.getPassword()));\r\n\r\n		IntraUser intraUser = null;\r\n		if(criteria.uniqueResult() !=null){\r\n			intraUser = (IntraUser)criteria.uniqueResult();\r\n			\r\n			/*\r\n			if(intraUser.isRemoved()){\r\n				req.setAttribute("message","そのユーザはメールアドレスの認証が済んでいません。");\r\n				return mapping.findForward("error");\r\n			}\r\n			*/\r\n			\r\n			Calendar calendarnum = Calendar.getInstance();\r\n			Cookie cookie = new Cookie("pmcsmu",intraUser.getMail());\r\n			cookie.setValue(intraUser.getMail());\r\n			cookie.setComment("hogehoge");\r\n			cookie.setMaxAge(60 * 60 * 168);\r\n\r\n			res.addCookie(cookie); \r\n			res.flushBuffer();\r\n			\r\n		}else{\r\n\r\n			if(intraUserForm.getAccount()!=null){\r\n				req.setAttribute("message","ユーザが存在しないか、パスワードが間違っています。");\r\n			}\r\n			return mapping.findForward("error");\r\n		}\r\n		session.flush();\r\n		new HTTPGetRedirection(req,res,"index.jsp","");\r\n		return null;\r\n	}\r\n	\r\n	\r\n}\r\n', 'Login', 12, NULL, NULL),
(29, 'package ##packagename##;\r\n\r\nimport java.net.URL;\r\nimport java.util.Enumeration;\r\n\r\nimport java.util.Collection;\r\nimport java.util.Iterator;\r\nimport java.util.Vector;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\n\r\nimport ##modelpackage##;\r\nimport ##modelcrudpackage##;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\nimport net.enclosing.util.StringFullfiller;\r\n\r\n\r\nimport org.apache.commons.httpclient.HttpClient;\r\nimport org.apache.commons.httpclient.methods.GetMethod;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport churchillobjects.rss4j.RssChannel;\r\nimport churchillobjects.rss4j.RssChannelItem;\r\nimport churchillobjects.rss4j.RssDocument;\r\nimport churchillobjects.rss4j.parser.RssParser;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		\r\n		\r\n		\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}\r\n', 'LoginPre', 12, NULL, NULL),
(30, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##beanpackage##;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport java.util.Iterator;\r\nimport java.util.Vector;\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\n\r\nimport net.enclosing.util.HibernateSession;\r\nimport net.storyteller.desktop.CopyProperties;\r\n\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n\r\n\r\n\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n                Vector vector = new Vector();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {\r\n			##modelclass## ##modelobj## = (##modelclass##) iter.next();\r\n			vector.add(##modelobj##);\r\n		}\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		##modelclass##Form ##modelobj##form = new ##modelclass##Form();\r\n		criteria = session.createCriteria(##modelclass##.class);\r\n\r\n\r\n		if (req.getAttribute("form")== null && req.getParameter("id")!=null){\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n			new CopyProperties(##modelobj##,##modelobj##form);\r\n		} else if(req.getAttribute("form")!=null){\r\n                        ##modelobj##form = (##modelclass##Form)req.getAttribute("form");\r\n			criteria.add(Restrictions.idEq(##modelobj##form.getId()));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		}\r\n		\r\n\r\n		req.setAttribute("model",##modelobj##);\r\n		req.setAttribute("form",##modelobj##form);\r\n		\r\n		\r\n		req.setAttribute("##modelobj##s",vector);\r\n		\r\n\r\n                if(req.getParameter("displayexport") !=null){\r\n     		    return mapping.findForward("displayexport");\r\n                }\r\n\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', 'DisplayXmlOf##modelclass##', 17, NULL, 14),
(32, 'package ##packagename##;\r\n\r\nimport ##modelpackage##;\r\nimport ##beanpackage##;\r\n\r\nimport java.io.File;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport net.enclosing.util.StringFullfiller;\r\nimport net.enclosing.util.HTTPGetRedirection;\r\nimport net.enclosing.util.HibernateSession;\r\n\r\nimport org.apache.commons.beanutils.BeanUtils;\r\nimport org.apache.commons.lang.StringUtils;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.Transaction;\r\nimport org.hibernate.criterion.Restrictions;\r\n\r\n\r\n\r\nimport java.util.Random;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n		Random random = new Random();\r\n		int  i = 		random.nextInt(criteria.list().size());\r\n		req.setAttribute("id",new Integer(i));\r\n		req.setAttribute("museigen","true");\r\n\r\n		sessionFactory.close();\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}\r\n', 'Museigen##modelclass##', 18, NULL, NULL),
(33, 'package ##packagename##;\r\n\r\nimport javax.servlet.http.HttpServletRequest;\r\nimport javax.servlet.http.HttpServletResponse;\r\n\r\nimport ##modelpackage##;\r\nimport ##beanpackage##;\r\n\r\nimport org.apache.struts.action.Action;\r\nimport org.apache.struts.action.ActionForm;\r\nimport org.apache.struts.action.ActionForward;\r\nimport org.apache.struts.action.ActionMapping;\r\nimport org.hibernate.Criteria;\r\nimport org.hibernate.Session;\r\nimport org.hibernate.SessionFactory;\r\nimport org.hibernate.criterion.Restrictions;\r\nimport org.springframework.beans.factory.BeanFactory;\r\nimport org.springframework.web.context.support.WebApplicationContextUtils;\r\n\r\nimport net.enclosing.util.HibernateSession;\r\n\r\npublic class ##nameofsentence## extends Action{\r\n	public ActionForward execute(\r\n			ActionMapping mapping,\r\n			ActionForm form,\r\n			HttpServletRequest req,\r\n			HttpServletResponse res) throws Exception{\r\n		\r\n		Session session = new HibernateSession().currentSession(this\r\n				.getServlet().getServletContext());\r\n\r\n\r\n		##modelclass## ##modelobj## = new ##modelclass##Impl();\r\n		Criteria criteria = session.createCriteria(##modelclass##.class);\r\n\r\n		if (req.getParameter("id") != null\r\n				&& !req.getParameter("id").equals("")) {\r\n			criteria.add(Restrictions.idEq(Integer.valueOf(req\r\n					.getParameter("id"))));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n\r\n		} else if (req.getAttribute("id") != null\r\n				&& !req.getAttribute("id").equals("")) {\r\n			criteria.add(Restrictions.idEq(req.getAttribute("id")));\r\n			##modelobj## = (##modelclass##) criteria.uniqueResult();\r\n		}\r\n\r\n		req.setAttribute("##modelobj##",##modelobj##);\r\n		\r\n		\r\n		\r\n		return mapping.findForward("success");\r\n	}\r\n	\r\n	\r\n}', 'Show##modelclass##Xml', 17, NULL, 16),
(34, 'package ##packagename##.api.rest.api;\r\n\r\nimport org.springframework.web.bind.annotation.RestController;\r\n\r\nimport com.wordnik.swagger.annotations.Api;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport ##packagename##.model.*;\r\nimport org.springframework.http.HttpStatus;\r\nimport org.springframework.http.ResponseEntity;\r\nimport org.springframework.web.bind.annotation.*;\r\nimport ##packagename##.api.rest.dto.##modelclass##Dto;\r\nimport ##packagename##.api.rest.service.##modelclass##Service;\r\n\r\nimport java.util.List;\r\n\r\n@RestController\r\n@RequestMapping("/api/v1/##modelclass##s")\r\n@Api(value = "##modelclass## API")\r\npublic class ##modelclass##Resource {\r\n\r\n    @Autowired\r\n    private ##modelclass##Service ##modelobj##Service;\r\n\r\n    @RequestMapping(method = RequestMethod.GET)\r\n    public List<##modelclass##Dto> getAll##modelclass##s() {\r\n        return ##modelobj##Service.getAll##modelclass##s();\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.GET)\r\n    public ##modelclass##Dto get##modelclass##(@PathVariable final String id) {\r\n        return ##modelobj##Service.get##modelclass##(id);\r\n    }\r\n\r\n    @RequestMapping(method = RequestMethod.POST)\r\n    public ResponseEntity<##modelclass##Dto> add##modelclass##(@RequestBody final ##modelclass##Dto ##modelobj##) {\r\n        ##modelclass##Dto created##modelclass## = ##modelobj##Service.create##modelclass##(##modelobj##);\r\n        return new ResponseEntity<>(created##modelclass##, HttpStatus.CREATED);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)\r\n    public ResponseEntity delete##modelclass##(@PathVariable final String id) {\r\n        ##modelobj##Service.delete##modelclass##(id);\r\n        return new ResponseEntity<>(HttpStatus.OK);\r\n    }\r\n\r\n    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)\r\n    public ResponseEntity<##modelclass##Dto> update##modelclass##(@PathVariable final String id, @RequestBody final ##modelclass##Dto ##modelobj##) {\r\n        ##modelclass##Dto created##modelclass## = ##modelobj##Service.update##modelclass##(id, ##modelobj##);\r\n        return new ResponseEntity<>(created##modelclass##, HttpStatus.OK);\r\n    }\r\n}', '##modelclass##Resource', 20, NULL, NULL),
(35, 'package ##packagename##.api.rest.converter;\r\n\r\nimport org.springframework.stereotype.Service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport ##packagename##.api.rest.dto.##modelclass##Dto;\r\nimport ##packagename##.api.rest.entity.##modelclass##Entity;\r\nimport ##packagename##.model.*;\r\n\r\n@Service\r\npublic class ##modelclass##Converter extends AbstractConverter<##modelclass##Entity, ##modelclass##Dto> {\r\n\r\n    @Override\r\n    public void toDto(final ##modelclass##Entity entity, final ##modelclass##Dto dto) {\r\n        // convert ##modelclass##Entity to ##modelclass##Dto\r\n\r\n    }\r\n\r\n    @Override\r\n    public void fromDto(final ##modelclass##Entity entity, final ##modelclass##Dto dto) {\r\n        // convert ##modelclass##Dto to ##modelclass##Entity\r\n     }\r\n}\r\n', '##modelclass##Converter', 20, NULL, NULL),
(36, 'package\r\n\r\nimport java.util.Collection;\r\n\r\n##packagename##.api.rest.converter;\r\n\r\nimport java.lang.reflect.ParameterizedType;\r\nimport java.util.ArrayList;\r\nimport java.util.Collection;\r\nimport java.util.List;\r\n\r\npublic abstract class AbstractConverter<EntityClass, DtoClass> {\r\n\r\n    private final Class<EntityClass> entityClass;\r\n    private final Class<DtoClass> dtoClass;\r\n\r\n    @SuppressWarnings("unchecked")\r\n    public AbstractConverter() {\r\n        final ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();\r\n        this.entityClass = (Class<EntityClass>) genericSuperclass.getActualTypeArguments()[0];\r\n        this.dtoClass = (Class<DtoClass>) genericSuperclass.getActualTypeArguments()[1];\r\n    }\r\n\r\n    protected DtoClass newDto() {\r\n        try {\r\n            return dtoClass.newInstance();\r\n        } catch (InstantiationException | IllegalAccessException e) {\r\n            throw new RuntimeException(e);\r\n        }\r\n    }\r\n\r\n    protected EntityClass newEntity() {\r\n        try {\r\n            return entityClass.newInstance();\r\n        } catch (InstantiationException | IllegalAccessException e) {\r\n            throw new RuntimeException(e);\r\n        }\r\n    }\r\n\r\n    public abstract void toDto(final EntityClass entity, final DtoClass dto);\r\n\r\n    public DtoClass toDto(final EntityClass entity) {\r\n        if (entity == null) {\r\n            return null;\r\n        }\r\n        final DtoClass dto = newDto();\r\n        toDto(entity, dto);\r\n        return dto;\r\n    }\r\n\r\n    public List<DtoClass> toDto(final Collection<? extends EntityClass> entities) {\r\n        final List<DtoClass> dtoCollection = new ArrayList<>();\r\n        entities.forEach(entity -> dtoCollection.add(toDto(entity)));\r\n        return dtoCollection;\r\n    }\r\n\r\n    public abstract void fromDto(final EntityClass entity, final DtoClass dto);\r\n\r\n\r\n    public EntityClass fromDto(final DtoClass dto) {\r\n        final EntityClass entity = newEntity();\r\n        fromDto(entity, dto);\r\n        return entity;\r\n    }\r\n}\r\n', 'AbstractConverter', 20, NULL, NULL),
(37, 'package ##packagename##.api.rest.dto;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\n\r\nimport com.fasterxml.jackson.annotation.JsonProperty;\r\n\r\nimport javax.xml.bind.annotation.XmlRootElement;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport ##packagename##.model.*;\r\n\r\npublic class ##modelclass##Dto {\r\n\r\n    public ##modelclass##Dto() {}\r\n\r\n    @JsonProperty("id")\r\n    public String id;\r\n}\r\n', '##modelclass##Dto', 20, NULL, NULL),
(38, 'package ##packagename##.api.rest.entity;\r\n\r\nimport javax.persistence.GeneratedValue;\r\nimport org.hibernate.annotations.GenericGenerator;\r\nimport javax.persistence.*;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\nimport java.util.Vector;\r\nimport ##modelpackage##;\r\n\r\n@Entity\r\n@Table(name = "##modelclass##s")\r\npublic class ##modelclass##Entity extends ##modelclass## {\r\n\r\n    public ##modelclass##Entity() {}\r\n\r\n    @Id\r\n    @GeneratedValue(generator = "uuid")\r\n    @GenericGenerator(name = "uuid", strategy = "uuid2")\r\n    @Column(name = "uuid", unique = true)\r\n    public String getId() {\r\n        return id;\r\n    }\r\n}\r\n', '##modelclass##Entity', 20, NULL, NULL),
(39, 'package ##packagename##.api.rest.repository;\r\n\r\nimport org.springframework.stereotype.Repository;\r\n\r\nimport org.springframework.data.jpa.repository.JpaRepository;\r\nimport org.springframework.stereotype.Repository;\r\nimport ##packagename##.api.rest.entity.##modelclass##Entity;\r\nimport ##modelpackage##;\r\n\r\n@Repository\r\npublic interface ##modelclass##Repository extends JpaRepository<##modelclass##Entity, String> {\r\n\r\n}', '##modelclass##Repository', 20, NULL, NULL),
(40, 'package ##packagename##.api.rest.service;\r\n\r\nimport org.springframework.stereotype.Service;\r\nimport org.springframework.beans.factory.annotation.Autowired;\r\nimport org.springframework.stereotype.Service;\r\nimport ##packagename##.api.rest.converter.##modelclass##Converter;\r\nimport ##packagename##.api.rest.dto.##modelclass##Dto;\r\nimport ##packagename##.api.rest.entity.##modelclass##Entity;\r\nimport ##packagename##.api.rest.repository.##modelclass##Repository;\r\nimport ##modelpackage##;\r\n\r\nimport java.util.List;\r\n\r\n@Service\r\npublic class ##modelclass##Service {\r\n\r\n    @Autowired\r\n    private ##modelclass##Repository ##modelobj##Repository;\r\n\r\n    @Autowired\r\n    private ##modelclass##Converter ##modelobj##Converter;\r\n\r\n        public List<##modelclass##Dto> getAll##modelclass##s(){\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.findAll());\r\n    }\r\n\r\n    public ##modelclass##Dto get##modelclass##(final String id){\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.findOne(id));\r\n    }\r\n\r\n    public ##modelclass##Dto create##modelclass##(##modelclass##Dto ##modelobj##Dto){\r\n        ##modelclass##Entity ##modelobj##Entity = ##modelobj##Converter.fromDto(##modelobj##Dto);\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.save(##modelobj##Entity));\r\n    }\r\n\r\n    public ##modelclass##Dto update##modelclass##(String id, ##modelclass##Dto ##modelobj##Dto){\r\n        ##modelobj##Repository.delete(id);\r\n        ##modelclass##Entity ##modelobj##Entity = ##modelobj##Converter.fromDto(##modelobj##Dto);\r\n        return ##modelobj##Converter.toDto(##modelobj##Repository.save(##modelobj##Entity));\r\n    }\r\n\r\n    public void delete##modelclass##(String id){\r\n        ##modelobj##Repository.delete(id);\r\n    }\r\n}\r\n', '##modelclass##Service', 20, NULL, NULL);

-- --------------------------------------------------------

--
-- テーブルの構造 `TEMPLATE_INPUT`
--

CREATE TABLE IF NOT EXISTS `TEMPLATE_INPUT` (
`ID` int(11) NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `VERB_FK` int(11) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=148 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `TEMPLATE_INPUT`
--

INSERT INTO `TEMPLATE_INPUT` (`ID`, `NAME`, `VERB_FK`) VALUES
(1, 'packagename', 1),
(2, 'modelclass', 2),
(3, 'modelobj', 2),
(4, 'modelpackage', 2),
(5, 'crudpackage', 2),
(6, 'modelcrudpackage', 2),
(7, 'formcontent', 2),
(8, 'packagename', 2),
(9, 'modelclass', 3),
(10, 'modelobj', 3),
(11, 'modelpackage', 3),
(12, 'crudpackage', 3),
(13, 'modelcrudpackage', 3),
(14, 'formcontent', 3),
(15, 'packagename', 3),
(16, 'packagename', 4),
(17, 'modelclass', 4),
(18, 'modelobj', 4),
(19, 'modelcrudpackage', 4),
(20, 'modelpackage', 4),
(21, 'modelclass', 6),
(22, 'modelobj', 6),
(23, 'modelpackage', 6),
(24, 'crudpackage', 6),
(25, 'modelcrudpackage', 6),
(26, 'formcontent', 6),
(27, 'packagename', 6),
(28, 'displaycontent', 6),
(29, 'modelclass', 7),
(30, 'modelobj', 7),
(31, 'modelpackage', 7),
(32, 'crudpackage', 7),
(33, 'modelcrudpackage', 7),
(34, 'formcontent', 7),
(35, 'packagename', 7),
(36, 'displaycontent', 7),
(37, 'addingtoclass', 7),
(38, 'addingtoobj', 7),
(39, 'relationvpsecoundcode', 6),
(40, 'relationvpcode', 6),
(41, 'modelclass', 8),
(42, 'modelobj', 8),
(43, 'modelpackage', 8),
(44, 'crudpackage', 8),
(45, 'modelcrudpackage', 8),
(46, 'formcontent', 8),
(47, 'packagename', 8),
(48, 'displaycontent', 8),
(49, 'relationvpsecoundcode', 8),
(50, 'relationvpcode', 8),
(51, 'relationvpcode', 9),
(52, 'relationvpsecoundcode', 9),
(53, 'displaycontent', 9),
(54, 'packagename', 9),
(55, 'formcontent', 9),
(56, 'modelcrudpackage', 9),
(57, 'crudpackage', 9),
(58, 'modelpackage', 9),
(59, 'modelobj', 9),
(60, 'modelclass', 9),
(61, 'relationvpcode', 10),
(62, 'relationvpsecoundcode', 10),
(63, 'displaycontent', 10),
(64, 'packagename', 10),
(65, 'formcontent', 10),
(66, 'modelcrudpackage', 10),
(67, 'crudpackage', 10),
(68, 'modelpackage', 10),
(69, 'modelobj', 10),
(70, 'modelclass', 10),
(71, 'modelclass', 11),
(72, 'modelobj', 11),
(73, 'modelpackage', 11),
(74, 'crudpackage', 11),
(75, 'modelcrudpackage', 11),
(76, 'formcontent', 11),
(77, 'packagename', 11),
(78, 'displaycontent', 11),
(79, 'relationvpsecoundcode', 11),
(80, 'relationvpcode', 11),
(81, 'addingtoclass', 11),
(82, 'addingtoobj', 11),
(83, 'beanpackage', 11),
(84, 'copyattrsatvp', 8),
(85, 'validation', 8),
(86, 'beanpackage', 8),
(87, 'displayexportcontent', 9),
(88, 'modelobj', 14),
(89, 'modelclass', 14),
(90, 'nameofsentence', 14),
(91, 'modelcrudpackage', 14),
(92, 'modelpackage', 14),
(93, 'packagename', 14),
(94, 'modelclass', 12),
(95, 'modelobj', 12),
(96, 'modelpackage', 12),
(97, 'crudpackage', 12),
(98, 'modelcrudpackage', 12),
(99, 'formcontent', 12),
(100, 'packagename', 12),
(101, 'displaycontent', 12),
(102, 'relationvpsecoundcode', 12),
(103, 'relationvpcode', 12),
(104, 'modelclass', 17),
(105, 'modelobj', 17),
(106, 'modelpackage', 17),
(107, 'crudpackage', 17),
(108, 'formcontent', 17),
(109, 'packagename', 17),
(110, 'displaycontent', 17),
(111, 'relationvpsecoundcode', 17),
(112, 'relationvpcode', 17),
(113, 'formcontent', 17),
(114, 'displayxmlcontent', 17),
(115, 'relationvpcode', 18),
(116, 'relationvpsecoundcode', 18),
(117, 'displaycontent', 18),
(118, 'packagename', 18),
(119, 'formcontent', 18),
(120, 'modelcrudpackage', 18),
(121, 'crudpackage', 18),
(122, 'modelpackage', 18),
(123, 'modelobj', 18),
(124, 'modelclass', 18),
(125, 'displayxmlcontent', 17),
(126, 'modelcrudpackage', 17),
(127, 'beanpackage', 17),
(128, '##japanese##', 8),
(129, '##japanese##', 9),
(130, 'showattrs', 10),
(131, 'packagename', 20),
(132, 'modelpackage', 20),
(135, 'modelclass', 20),
(147, 'modelobj', 20);

-- --------------------------------------------------------

--
-- テーブルの構造 `TEST`
--

CREATE TABLE IF NOT EXISTS `TEST` (
`ID` int(11) NOT NULL,
  `STEPSTOREPEAT` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `WHATYOUEXPECTEDTOSEE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `WHATYOUSAWINSTEAD` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `DEBUGED` tinyint(4) NOT NULL,
  `CHECKED` tinyint(4) NOT NULL,
  `J2EE_STORY_FK` int(11) NOT NULL,
  `JSP_FK` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `VALIDATION_RULE`
--

CREATE TABLE IF NOT EXISTS `VALIDATION_RULE` (
`ID` int(11) NOT NULL,
  `DEFAULTERRORMESSAGE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `template` varchar(10000) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `VALIDATION_RULE`
--

INSERT INTO `VALIDATION_RULE` (`ID`, `DEFAULTERRORMESSAGE`, `NAME`, `template`) VALUES
(1, '', 'notnull', 'if(StringUtils.isBlank(##noun##form.get##Attr##())){\r\n   error += "##japanese##は空にはできません。<br />"; \r\n}\r\n'),
(2, '', 'int', 'if(!StringUtils.isNumeric(req.getParameter("##attr##"))){\r\n    error += "##japanese##には数値のみを入れてください。<br />";\r\n}'),
(3, '', 'date', 'if(!##noun##form.is##attr##IsValid()){\r\n   error += "##japanese## はyyyy/MM/ddにしてください。<br />";\r\n}'),
(4, '', 'notnullbyreq', 'if(StringUtils.isBlank(req.getParameter("##attr##"))){\r\n    error += "##japanese##は空にはできません。<br />";\r\n}'),
(5, '', 'alphanumeric', '        if(!##noun##form.get##Attr##().matches("\\\\\\p{Alnum}*")){\r\n   error += "##japanese##は半角英数字のみです。";\r\n}'),
(6, '', 'a-zA-Z0-9&/-', '        if(!productform.getTypename().matches("[a-zA-Z0-9&/-]*")){\r\n      	   error += "##japanese##は半角英数字及び記号(/&-)のみです。";\r\n        }\r\n');

-- --------------------------------------------------------

--
-- テーブルの構造 `VALIDATION_RULE_CHOISE`
--

CREATE TABLE IF NOT EXISTS `VALIDATION_RULE_CHOISE` (
`ID` bigint(20) NOT NULL,
  `ACTUALCODE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ERRORMESSAGE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `VALIDATION_RULE_FK` int(11) NOT NULL,
  `ATTR_USE_FK` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `VERB`
--

CREATE TABLE IF NOT EXISTS `VERB` (
`ID` int(11) NOT NULL,
  `TWOOBJECTS` tinyint(4) NOT NULL,
  `VALID` tinyint(4) NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `JAPANESE` varchar(255) NOT NULL,
  `MARKET_AVERAGE_PRICE` int(11) NOT NULL,
  `MARKET_AVERAGE_DAYS` int(11) NOT NULL,
  `PROFILT` int(11) NOT NULL,
  `COST` int(11) NOT NULL,
  `PRICE` int(11) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `VERB`
--

INSERT INTO `VERB` (`ID`, `TWOOBJECTS`, `VALID`, `NAME`, `JAPANESE`, `MARKET_AVERAGE_PRICE`, `MARKET_AVERAGE_DAYS`, `PROFILT`, `COST`, `PRICE`) VALUES
(1, 0, 0, 'RSSBlock', '', 0, 0, 0, 0, 0),
(2, 0, 1, 'CRUD', '', 0, 0, 0, 0, 0),
(3, 0, 0, 'RSSExport', '', 0, 0, 0, 0, 0),
(4, 0, 0, 'RssImport', '', 0, 0, 0, 0, 0),
(5, 0, 0, 'GrepRss', '', 0, 0, 0, 0, 0),
(6, 0, 1, 'ALL', '', 0, 0, 0, 0, 0),
(7, 1, 0, 'MultipleFileFormUpload', '', 0, 0, 0, 0, 0),
(8, 0, 0, 'Post', '', 0, 0, 0, 0, 0),
(9, 0, 0, 'Display', '', 0, 0, 0, 0, 0),
(10, 0, 0, 'Show', '', 0, 0, 0, 0, 0),
(11, 1, 1, 'SimpleFilePost', '', 0, 0, 0, 0, 0),
(12, 0, 0, 'Login', '', 0, 0, 0, 0, 0),
(13, 0, 0, 'NotifyByMailTo', '', 0, 0, 0, 0, 0),
(14, 0, 0, 'Delete', '', 0, 0, 0, 0, 0),
(15, 1, 1, 'Update', '', 0, 0, 0, 0, 0),
(16, 0, 0, 'DisplayOf', '', 0, 0, 0, 0, 0),
(17, 0, 1, 'DisplayXmlOf', '', 0, 0, 0, 0, 0),
(18, 0, 1, 'MuseigenShow', '', 0, 0, 0, 0, 0),
(19, 0, 0, 'test', 'test', 0, 0, 0, 0, 0),
(20, 0, 0, 'RESTFul', 'RESTFul', 0, 0, 0, 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ANDROMDA_CORE_JAR_FILE`
--
ALTER TABLE `ANDROMDA_CORE_JAR_FILE`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `ATTR`
--
ALTER TABLE `ATTR`
 ADD PRIMARY KEY (`ID`), ADD KEY `ATTR_NOUN_FKC` (`NOUN_FK`);

--
-- Indexes for table `ATTR_USE`
--
ALTER TABLE `ATTR_USE`
 ADD PRIMARY KEY (`ID`), ADD KEY `ATTR_USE_NOUN_USE_FKC` (`NOUN_USE_FK`), ADD KEY `ATTR_USE_ATTR_FKC` (`ATTR_FK`);

--
-- Indexes for table `causal_relation`
--
ALTER TABLE `causal_relation`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `CLIENT`
--
ALTER TABLE `CLIENT`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `COMMON_TRANSLATION`
--
ALTER TABLE `COMMON_TRANSLATION`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `COMPONEY`
--
ALTER TABLE `COMPONEY`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `INTRA_USER`
--
ALTER TABLE `INTRA_USER`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `J2EE_STORY`
--
ALTER TABLE `J2EE_STORY`
 ADD PRIMARY KEY (`ID`), ADD UNIQUE KEY `ANDROMDA_CORE_JAR_FILE_FK` (`ANDROMDA_CORE_JAR_FILE_FK`), ADD KEY `J2EE_STORY_ANDROMDA_CORE_JAR_C` (`ANDROMDA_CORE_JAR_FILE_FK`);

--
-- Indexes for table `JSP`
--
ALTER TABLE `JSP`
 ADD PRIMARY KEY (`ID`), ADD KEY `JSP_SENTENCE_FKC` (`SENTENCE_FK`);

--
-- Indexes for table `JSP_TEMPLATE`
--
ALTER TABLE `JSP_TEMPLATE`
 ADD PRIMARY KEY (`ID`), ADD KEY `JSP_TEMPLATE_VERB_FKC` (`VERB_FK`);

--
-- Indexes for table `MANUAL_STEP`
--
ALTER TABLE `MANUAL_STEP`
 ADD PRIMARY KEY (`ID`), ADD UNIQUE KEY `OUT_OF_PATTEN_SENTENCE_FK` (`OUT_OF_PATTEN_SENTENCE_FK`), ADD UNIQUE KEY `SENTENCE_FK` (`SENTENCE_FK`), ADD KEY `MANUAL_STEP_OUT_OF_PATTEN_SENC` (`OUT_OF_PATTEN_SENTENCE_FK`), ADD KEY `MANUAL_STEP_J2EE_STORY_FKC` (`J2EE_STORY_FK`), ADD KEY `MANUAL_STEP_SENTENCE_FKC` (`SENTENCE_FK`);

--
-- Indexes for table `NOUN`
--
ALTER TABLE `NOUN`
 ADD PRIMARY KEY (`ID`), ADD KEY `NOUN_J2EE_STORY_FKC` (`J2EE_STORY_FK`);

--
-- Indexes for table `NOUN_CLAUSE`
--
ALTER TABLE `NOUN_CLAUSE`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `NOUN_USE`
--
ALTER TABLE `NOUN_USE`
 ADD PRIMARY KEY (`ID`), ADD KEY `NOUN_USE_NOUN_CLAUSE_FKC` (`NOUN_CLAUSE_FK`), ADD KEY `NOUN_USE_NOUN_FKC` (`NOUN_FK`);

--
-- Indexes for table `OUT_OF_PATTEN_SENTENCE`
--
ALTER TABLE `OUT_OF_PATTEN_SENTENCE`
 ADD PRIMARY KEY (`ID`), ADD KEY `OUT_OF_PATTEN_SENTENCE_J2EE_SC` (`J2EE_STORY_FK`);

--
-- Indexes for table `POST_TEMPLATE`
--
ALTER TABLE `POST_TEMPLATE`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `SENTENCE`
--
ALTER TABLE `SENTENCE`
 ADD PRIMARY KEY (`ID`), ADD KEY `SENTENCE_J2EE_STORY_FKC` (`J2EE_STORY_FK`), ADD KEY `SENTENCE_FIRSTOBJECTIVE_FKC` (`FIRSTOBJECTIVE_FK`), ADD KEY `SENTENCE_VERB_FKC` (`VERB_FK`), ADD KEY `SENTENCE_SECOUNTOBJECTIVE_FKC` (`SECOUNTOBJECTIVE_FK`);

--
-- Indexes for table `STATIC_DATA`
--
ALTER TABLE `STATIC_DATA`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `STORYTELLER`
--
ALTER TABLE `STORYTELLER`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `STORYTELLER_PAGE`
--
ALTER TABLE `STORYTELLER_PAGE`
 ADD PRIMARY KEY (`ID`), ADD UNIQUE KEY `JSP_FK` (`JSP_FK`), ADD UNIQUE KEY `STRUTS_ACTION_FK` (`STRUTS_ACTION_FK`), ADD KEY `STORYTELLER_PAGE_STRUTS_ACTIOC` (`STRUTS_ACTION_FK`), ADD KEY `STORYTELLER_PAGE_JSP_FKC` (`JSP_FK`);

--
-- Indexes for table `STRUTS_ACTION`
--
ALTER TABLE `STRUTS_ACTION`
 ADD PRIMARY KEY (`ID`), ADD KEY `STRUTS_ACTION_SENTENCE_FKC` (`SENTENCE_FK`), ADD KEY `STRUTS_ACTION_TARGETEEACTION_C` (`TARGETEEACTION_FK`), ADD KEY `STRUTS_ACTION_TARGETEEJSP_FKC` (`TARGETEEJSP_FK`);

--
-- Indexes for table `STRUTS_ACTION_TEMPLATE`
--
ALTER TABLE `STRUTS_ACTION_TEMPLATE`
 ADD PRIMARY KEY (`ID`), ADD KEY `STRUTS_ACTION_TEMPLATE_TARGETC` (`TARGETEEACTION_FK`), ADD KEY `STRUTS_ACTION_TEMPLATE_VERB_FC` (`VERB_FK`), ADD KEY `STRUTS_ACTION_TEMPLATE_JSP_TEC` (`JSP_TEMPLATE_FK`);

--
-- Indexes for table `TEMPLATE_INPUT`
--
ALTER TABLE `TEMPLATE_INPUT`
 ADD PRIMARY KEY (`ID`), ADD KEY `TEMPLATE_INPUT_VERB_FKC` (`VERB_FK`);

--
-- Indexes for table `TEST`
--
ALTER TABLE `TEST`
 ADD PRIMARY KEY (`ID`), ADD KEY `TEST_J2EE_STORY_FKC` (`J2EE_STORY_FK`), ADD KEY `TEST_JSP_FKC` (`JSP_FK`);

--
-- Indexes for table `VALIDATION_RULE`
--
ALTER TABLE `VALIDATION_RULE`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `VALIDATION_RULE_CHOISE`
--
ALTER TABLE `VALIDATION_RULE_CHOISE`
 ADD PRIMARY KEY (`ID`), ADD KEY `VALIDATION_RULE_CHOISE_VALIDAC` (`VALIDATION_RULE_FK`), ADD KEY `VALIDATION_RULE_CHOISE_ATTR_UC` (`ATTR_USE_FK`);

--
-- Indexes for table `VERB`
--
ALTER TABLE `VERB`
 ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ANDROMDA_CORE_JAR_FILE`
--
ALTER TABLE `ANDROMDA_CORE_JAR_FILE`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `ATTR`
--
ALTER TABLE `ATTR`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=63;
--
-- AUTO_INCREMENT for table `ATTR_USE`
--
ALTER TABLE `ATTR_USE`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `COMMON_TRANSLATION`
--
ALTER TABLE `COMMON_TRANSLATION`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=118;
--
-- AUTO_INCREMENT for table `COMPONEY`
--
ALTER TABLE `COMPONEY`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `INTRA_USER`
--
ALTER TABLE `INTRA_USER`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `J2EE_STORY`
--
ALTER TABLE `J2EE_STORY`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `JSP`
--
ALTER TABLE `JSP`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `JSP_TEMPLATE`
--
ALTER TABLE `JSP_TEMPLATE`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `MANUAL_STEP`
--
ALTER TABLE `MANUAL_STEP`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `NOUN`
--
ALTER TABLE `NOUN`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `NOUN_CLAUSE`
--
ALTER TABLE `NOUN_CLAUSE`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=27;
--
-- AUTO_INCREMENT for table `NOUN_USE`
--
ALTER TABLE `NOUN_USE`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=26;
--
-- AUTO_INCREMENT for table `OUT_OF_PATTEN_SENTENCE`
--
ALTER TABLE `OUT_OF_PATTEN_SENTENCE`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `POST_TEMPLATE`
--
ALTER TABLE `POST_TEMPLATE`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `SENTENCE`
--
ALTER TABLE `SENTENCE`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=26;
--
-- AUTO_INCREMENT for table `STATIC_DATA`
--
ALTER TABLE `STATIC_DATA`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `STORYTELLER`
--
ALTER TABLE `STORYTELLER`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `STORYTELLER_PAGE`
--
ALTER TABLE `STORYTELLER_PAGE`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `STRUTS_ACTION`
--
ALTER TABLE `STRUTS_ACTION`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=83;
--
-- AUTO_INCREMENT for table `STRUTS_ACTION_TEMPLATE`
--
ALTER TABLE `STRUTS_ACTION_TEMPLATE`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=41;
--
-- AUTO_INCREMENT for table `TEMPLATE_INPUT`
--
ALTER TABLE `TEMPLATE_INPUT`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=148;
--
-- AUTO_INCREMENT for table `TEST`
--
ALTER TABLE `TEST`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `VALIDATION_RULE`
--
ALTER TABLE `VALIDATION_RULE`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `VALIDATION_RULE_CHOISE`
--
ALTER TABLE `VALIDATION_RULE_CHOISE`
MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `VERB`
--
ALTER TABLE `VERB`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
