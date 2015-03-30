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
-- テーブルの構造 `JSP_TEMPLATE`
-- 

CREATE TABLE `JSP_TEMPLATE` (
  `ID` int(11) NOT NULL auto_increment,
  `TEMPLATE` varchar(10000) character set utf8 collate utf8_bin NOT NULL,
  `NAMETEMPLATE` varchar(255) character set utf8 collate utf8_bin NOT NULL,
  `VERB_FK` int(11) NOT NULL,
  PRIMARY KEY  (`ID`),
  KEY `JSP_TEMPLATE_VERB_FKC` (`VERB_FK`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

-- 
-- テーブルのダンプデータ `JSP_TEMPLATE`
-- 

INSERT INTO `JSP_TEMPLATE` VALUES (1, 0x3c2540207061676520636f6e74656e74547970653d22746578742f68746d6c3b20636861727365743d5554462d38222070616765456e636f64696e673d225554462d382220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f636f726522207072656669783d22632220253e0d0a0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f666d7422207072656669783d22666d742220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f786d6c22207072656669783d22782220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f66756e6374696f6e7322207072656669783d22666e2220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f7374727574732e6170616368652e6f72672f746167732d74696c657322207072656669783d2274696c65732220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d6c6f67696322207072656669783d226c6f6769632220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d68746d6c22207072656669783d2268746d6c2220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d6265616e22207072656669783d226265616e2220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f646973706c61797461672e73662e6e657422207072656669783d22646973706c61792220253e0d0a3c25402070616765206973454c49676e6f7265643d2266616c73652220253e0d0a0d0a090d0a093c6c6f6769633a697465726174652069643d226f22206e616d653d226f757470757473223e0d0a093c6469763e0d0a09247b6f2e6465736372697074696f6e7d3b0d0a093c2f6469763e0d0a093c68723e0d0a093c2f6c6f6769633a697465726174653e0d0a, 0x525353426c6f636b2e6a7370, 1);
INSERT INTO `JSP_TEMPLATE` VALUES (2, 0x3c2540207061676520636f6e74656e74547970653d22746578742f68746d6c3b20636861727365743d5554462d38222070616765456e636f64696e673d225554462d382220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f636f726522207072656669783d22632220253e0d0a0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f666d7422207072656669783d22666d742220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f786d6c22207072656669783d22782220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f66756e6374696f6e7322207072656669783d22666e2220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f7374727574732e6170616368652e6f72672f746167732d74696c657322207072656669783d2274696c65732220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d6c6f67696322207072656669783d226c6f6769632220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d68746d6c22207072656669783d2268746d6c2220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d6265616e22207072656669783d226265616e2220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f646973706c61797461672e73662e6e657422207072656669783d22646973706c61792220253e0d0a3c25402070616765206973454c49676e6f7265643d2266616c73652220253e0d0a0d0a3c68746d6c3a68746d6c3e0d0a3c74696c65733a696e7365727420706167653d222f682e6a7370222f3e0d0a3c64697620636c6173733d226d61696e223e0d0a3c7370616e20636c6173733d227469746c65223e23236d6f64656c6f626a2323733c2f7370616e3e0d0a20202020202020202020202020202020202020203c646973706c61793a7461626c65206e616d653d22247b23236d6f64656c6f626a2323737d222069643d22726f772220726571756573745552493d2223236d6f64656c636c6173732323732e646f220d0a2020202020202020202020202020202020202020202020202020202072657175657374555249636f6e746578743d2266616c7365220d0a202020202020202020202020202020202020202020202020202020206578706f72743d227472756522207061676573697a653d2231352220736f72743d226c697374223e0d0a2020202020202020202020202020202020202020202020203c646973706c61793a636f6c756d6e206d656469613d2268746d6c2220736f727461626c653d2266616c7365223e0d0a2020202020202020202020202020202020202020202020203c6120687265663d2223236d6f64656c636c617373232344657461696c2e646f3f69643d247b726f772e69647d223e65643c2f613e0d0a2020202020202020202020202020202020202020202020203c6120687265663d2244656c65746523236d6f64656c636c61737323232e646f3f69643d247b726f772e69647d223e64656c3c2f613e0d0a2020202020202020202020202020202020202020202020203c2f646973706c61793a636f6c756d6e3e0d0a2323646973706c6179636f6e74656e7423230d0a20202020202020202020202020202020202020203c2f646973706c61793a7461626c653e0d0a0d0a0d0a2020202020202020202020202020202020202020202020203c6120687265663d2223236d6f64656c636c617373232344657461696c2e646f223e6e65772023236d6f64656c636c61737323233c2f613e0d0a3c2f6469763e0d0a0d0a0d0a3c64697620636c6173733d22737562223e0d0a0d0a09093c68746d6c3a666f726d206d6574686f643d22504f53542220616374696f6e3d222f23236d6f64656c636c61737323235650223e0d0a202020202020202020203c68746d6c3a68696464656e206e616d653d2223236d6f64656c6f626a2323222070726f70657274793d226964222f3e0d0a0d0a2323666f726d636f6e74656e7423230d0a0d0a202020202020202020203c68746d6c3a7375626d6974202f3e0d0a09093c2f68746d6c3a666f726d3e0d0a3c2f6469763e0d0a0d0a0d0a0d0a0d0a0d0a0d0a093c2f626f64793e0d0a3c2f68746d6c3a68746d6c3e0d0a0d0a, 0x23236d6f64656c636c6173732323732e6a7370, 2);
INSERT INTO `JSP_TEMPLATE` VALUES (3, 0x3c2540207061676520636f6e74656e74547970653d22746578742f68746d6c3b20636861727365743d5554462d38222070616765456e636f64696e673d225554462d382220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f636f726522207072656669783d22632220253e0d0a0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f666d7422207072656669783d22666d742220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f786d6c22207072656669783d22782220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f66756e6374696f6e7322207072656669783d22666e2220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f7374727574732e6170616368652e6f72672f746167732d74696c657322207072656669783d2274696c65732220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d6c6f67696322207072656669783d226c6f6769632220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d68746d6c22207072656669783d2268746d6c2220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d6265616e22207072656669783d226265616e2220253e0d0a0d0a3c2540207461676c6962207572693d22687474703a2f2f646973706c61797461672e73662e6e657422207072656669783d22646973706c61792220253e0d0a0d0a0d0a3c25402070616765206973454c49676e6f7265643d2266616c73652220253e0d0a0d0a3c68746d6c3a68746d6c3e0d0a3c74696c65733a696e7365727420706167653d222f682e6a7370222f3e0d0a0d0a3c64697620636c6173733d226d61696e223e0d0a3c7370616e20636c6173733d227469746c65223e23236d6f64656c636c617373232320e7b7a8e99b863c2f7370616e3e0d0a09093c68746d6c3a666f726d206d6574686f643d22504f53542220616374696f6e3d222f23236d6f64656c636c61737323235650223e0d0a202020202020202020203c68746d6c3a68696464656e206e616d653d2223236d6f64656c6f626a2323222070726f70657274793d226964222f3e0d0a0d0a2323666f726d636f6e74656e7423230d0a0d0a202020202020202020203c68746d6c3a7375626d6974202f3e0d0a09093c2f68746d6c3a666f726d3e0d0a3c2f6469763e0d0a0d0a3c64697620636c6173733d22737562223e0d0a0d0a0d0a3c2f6469763e0d0a093c2f626f64793e0d0a3c2f68746d6c3a68746d6c3e0d0a0d0a0d0a, 0x23236d6f64656c636c617373232344657461696c2e6a7370, 2);
INSERT INTO `JSP_TEMPLATE` VALUES (4, 0x3c2540207061676520636f6e74656e74547970653d22746578742f68746d6c3b20636861727365743d5554462d38222070616765456e636f64696e673d225554462d382220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f636f726522207072656669783d22632220253e0d0a0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f666d7422207072656669783d22666d742220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f786d6c22207072656669783d22782220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f66756e6374696f6e7322207072656669783d22666e2220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f7374727574732e6170616368652e6f72672f746167732d74696c657322207072656669783d2274696c65732220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d6c6f67696322207072656669783d226c6f6769632220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d68746d6c22207072656669783d2268746d6c2220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d6265616e22207072656669783d226265616e2220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f646973706c61797461672e73662e6e657422207072656669783d22646973706c61792220253e0d0a3c25402070616765206973454c49676e6f7265643d2266616c73652220253e0d0a0d0a3c68746d6c3a68746d6c3e0d0a3c74696c65733a696e7365727420706167653d222f682e6a7370222f3e0d0a3c64697620636c6173733d226d61696e223e0d0a0d0a3c666f726d20616374696f6e3d2253657453656c656374696f6e4f6623236d6f64656c636c617373232323236174747223232e646f22206d6574686f643d22706f737422206e616d653d22666f726d223e0d0a3c6120687265663d22247b66726f6d7d2e646f3f7061676573697a653d3230223e3230e4bbb63c2f613e0d0a3c6120687265663d22247b66726f6d7d2e646f3f7061676573697a653d3530223e3530e4bbb63c2f613e0d0a3c6120687265663d22247b66726f6d7d2e646f3f7061676573697a653d313030223e313030e4bbb63c2f613e0d0a3c6120687265663d22247b66726f6d7d2e646f3f7061676573697a653d323030223e323030e4bbb63c2f613e0d0a3c6120687265663d22247b66726f6d7d2e646f3f7061676573697a653d333030223e333030e4bbb63c2f613e0d0a3c6120687265663d22247b66726f6d7d2e646f3f7061676573697a653d353030223e353030e4bbb63c2f613e0d0a3c6120687265663d222322206f6e636c69636b3d2273656c656374616c6c28666f726d293b223e73656c65637420616c6c3c2f613e0d0a3c7370616e20636c6173733d227469746c65223e23236d6f64656c6f626a2323733c2f7370616e3e0d0a20202020202020202020202020202020202020203c646973706c61793a7461626c65206e616d653d22247b23236d6f64656c6f626a2323737d222069643d22726f772220726571756573745552493d2223236d6f64656c636c6173732323732e646f220d0a2020202020202020202020202020202020202020202020202020202072657175657374555249636f6e746578743d2266616c7365220d0a202020202020202020202020202020202020202020202020202020206578706f72743d227472756522207061676573697a653d2231352220736f72743d226c697374223e0d0a2020202020202020202020202020202020202020202020203c646973706c61793a636f6c756d6e206d656469613d2268746d6c2220736f727461626c653d2266616c7365223e0d0a2020202020202020202020202020202020202020202020203c6120687265663d2223236d6f64656c636c617373232344657461696c2e646f3f69643d247b726f772e69647d223e65643c2f613e0d0a2020202020202020202020202020202020202020202020203c6120687265663d2244656c65746523236d6f64656c636c61737323232e646f3f69643d247b726f772e69647d223e64656c3c2f613e0d0a2020202020202020202020202020202020202020202020203c2f646973706c61793a636f6c756d6e3e0d0a2323646973706c6179636f6e74656e7423230d0a20202020202020202020202020202020202020203c2f646973706c61793a7461626c653e0d0a0d0a0d0a2020202020202020202020202020202020202020202020203c6120687265663d2223236d6f64656c636c617373232344657461696c2e646f223e6e65772023236d6f64656c636c61737323233c2f613e0d0a3c68746d6c3a7375626d6974202f3e0d0a3c2f666f726d3e0d0a3c2f6469763e0d0a0d0a0d0a3c64697620636c6173733d22737562223e0d0a0d0a09093c68746d6c3a666f726d206d6574686f643d22504f53542220616374696f6e3d222f23236d6f64656c636c61737323235650223e0d0a202020202020202020203c68746d6c3a68696464656e206e616d653d2223236d6f64656c6f626a2323222070726f70657274793d226964222f3e0d0a0d0a2323666f726d636f6e74656e7423230d0a0d0a202020202020202020203c68746d6c3a7375626d6974202f3e0d0a09093c2f68746d6c3a666f726d3e0d0a3c2f6469763e0d0a0d0a0d0a0d0a0d0a0d0a0d0a093c2f626f64793e0d0a3c2f68746d6c3a68746d6c3e0d0a0d0a, 0x23236d6f64656c636c6173732323732e6a7370, 6);
INSERT INTO `JSP_TEMPLATE` VALUES (5, 0x3c2540207061676520636f6e74656e74547970653d22746578742f68746d6c3b20636861727365743d5554462d38222070616765456e636f64696e673d225554462d382220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f636f726522207072656669783d22632220253e0d0a0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f666d7422207072656669783d22666d742220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f786d6c22207072656669783d22782220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f6a6176612e73756e2e636f6d2f6a73702f6a73746c2f66756e6374696f6e7322207072656669783d22666e2220253e0d0a3c2540207461676c6962207572693d22687474703a2f2f7374727574732e6170616368652e6f72672f746167732d74696c657322207072656669783d2274696c65732220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d6c6f67696322207072656669783d226c6f6769632220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d68746d6c22207072656669783d2268746d6c2220253e0d0a3c2540207461676c6962207572693d222f746167732f7374727574732d6265616e22207072656669783d226265616e2220253e0d0a0d0a3c2540207461676c6962207572693d22687474703a2f2f646973706c61797461672e73662e6e657422207072656669783d22646973706c61792220253e0d0a0d0a0d0a3c25402070616765206973454c49676e6f7265643d2266616c73652220253e0d0a0d0a3c68746d6c3a68746d6c3e0d0a3c74696c65733a696e7365727420706167653d222f682e6a7370222f3e0d0a0d0a3c64697620636c6173733d226d61696e223e0d0a3c7370616e20636c6173733d227469746c65223e23236d6f64656c636c617373232320e7b7a8e99b863c2f7370616e3e0d0a09093c68746d6c3a666f726d206d6574686f643d22504f53542220616374696f6e3d222f23236d6f64656c636c61737323235650223e0d0a202020202020202020203c68746d6c3a68696464656e206e616d653d2223236d6f64656c6f626a2323222070726f70657274793d226964222f3e0d0a0d0a2323666f726d636f6e74656e7423230d0a0d0a202020202020202020203c68746d6c3a7375626d69742076616c75653d22e4bf9de5ad98222f3e0d0a09093c2f68746d6c3a666f726d3e0d0a3c2f6469763e0d0a0d0a3c64697620636c6173733d22737562223e0d0a0d0a0d0a3c2f6469763e0d0a093c2f626f64793e0d0a3c2f68746d6c3a68746d6c3e0d0a0d0a0d0a, 0x23236d6f64656c636c617373232344657461696c2e6a7370, 6);
