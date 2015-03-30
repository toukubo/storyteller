if("salesMny".equals(attr)){ return "売上高"; }
if("salesMny".equals(attr) && isGrownrate(attr)){ return "売上高比較比"; }
if("salesQty".equals(attr)){ return "売上数量"; }
if("salesQty".equals(attr) && isGrownrate(attr)){ return "売上数量比較比"; }
