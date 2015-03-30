if("rcvQty".equals(attr)){ return "仕入数量"; }
if("rcvQty".equals(attr) && isGrownrate(attr)){ return "仕入数量比較比"; }
if("rcvSellprc".equals(attr)){ return "仕入売価"; }
if("rcvSellprc".equals(attr) && isGrownrate(attr)){ return "仕入売価比較比"; }
if("rcvCostprc".equals(attr)){ return "仕入原価"; }
if("rcvCostprc".equals(attr) && isGrownrate(attr)){ return "仕入原価比較比"; }
if("inRcvRtnCostprc".equals(attr)){ return ""; }
if("inRcvRtnCostprc".equals(attr) && isGrownrate(attr)){ return "比較比"; }
