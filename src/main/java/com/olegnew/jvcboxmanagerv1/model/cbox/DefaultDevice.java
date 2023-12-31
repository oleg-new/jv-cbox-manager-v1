package com.olegnew.jvcboxmanagerv1.model.cbox;

import java.util.ArrayList;
import java.util.List;

public class DefaultDevice {

    private static DefaultDevice instance;

    private final List<Element> listOfDefaultValues;

    private DefaultDevice() {
        listOfDefaultValues = createDefaultList();
    }

    public List<Element> getListOfDefaultValues() {
        return listOfDefaultValues;
    }

    public static synchronized DefaultDevice getInstance() {
        if (instance == null) {
            instance = new DefaultDevice();
        }
        return instance;
    }

    private List<Element> createDefaultList() {
        Element element = new Element();
        element.setOid("1.3.6.1.4.1.17484.2.1.1.0");
        element.setName("SystemName");
        element.setDataType("OctetString");
        element.setUsability(false);
        element.setRewritable(false);

        List<Element> resultList = new ArrayList<>();
        resultList.add(element);

        Element element1 = new Element();
        element1.setOid("1.3.6.1.2.1.2.2.1.2.1");
        element1.setName("ifDescr");
        element1.setDataType("OctetString");
        element1.setUsability(false);
        element1.setRewritable(false);
        resultList.add(element1);

        Element element2 = new Element();
        element2.setOid("1.3.6.1.2.1.2.2.1.6.1");
        element2.setName("ifPhysAddress");
        element2.setDataType("OctetString");
        element2.setUsability(true);
        element2.setRewritable(false);
        resultList.add(element2);

        Element element3 = new Element();
        element3.setOid("1.3.6.1.2.1.2.2.1.9.1");
        element3.setName("ifLastChange");
        element3.setDataType("OctetString");
        element3.setUsability(true);
        element3.setRewritable(false);
        resultList.add(element3);

        Element element4 = new Element();
        element4.setOid("1.3.6.1.4.1.17484.2.1.2.0");
        element4.setName("SysMACaddress");
        element4.setDataType("OctetString");
        element4.setUsability(true);
        element4.setRewritable(false);
        resultList.add(element4);

        Element element5 = new Element();
        element5.setOid("1.3.6.1.4.1.17484.2.1.3.0");
        element5.setName("SysIPaddress");
        element5.setDataType("OctetString");
        element5.setUsability(true);
        element5.setRewritable(true);
        resultList.add(element5);

        Element element6 = new Element();
        element6.setOid("1.3.6.1.4.1.17484.2.1.4.0");
        element6.setName("SysIPmask");
        element6.setDataType("OctetString");
        element6.setUsability(true);
        element6.setRewritable(true);
        resultList.add(element6);

        Element element7 = new Element();
        element7.setOid("1.3.6.1.4.1.17484.2.1.5.0");
        element7.setName("SysGateIPaddress");
        element7.setDataType("OctetString");
        element7.setUsability(true);
        element7.setRewritable(true);
        resultList.add(element7);

        Element element8 = new Element();
        element8.setOid("1.3.6.1.4.1.17484.2.1.6.0");
        element8.setName("SysTrapIPaddress");
        element8.setDataType("OctetString");
        element8.setUsability(true);
        element8.setRewritable(true);
        resultList.add(element8);

        Element element9 = new Element();
        element9.setOid("1.3.6.1.4.1.17484.2.1.7.0");
        element9.setName("SysSnmpAccess");
        element9.setDataType("OctetString");
        element9.setUsability(true);
        element9.setRewritable(true);
        resultList.add(element9);

        Element element10 = new Element();
        element10.setOid("1.3.6.1.4.1.17484.2.1.8.0");
        element10.setName("SysSnmpRdComm");
        element10.setDataType("OctetString");
        element10.setUsability(true);
        element10.setRewritable(true);
        resultList.add(element10);

        Element element11 = new Element();
        element11.setOid("1.3.6.1.4.1.17484.2.1.9.0");
        element11.setName("SysSnmpWrComm");
        element11.setDataType("OctetString");
        element11.setUsability(true);
        element11.setRewritable(true);
        resultList.add(element11);

        Element element12 = new Element();
        element12.setOid("1.3.6.1.4.1.17484.2.1.10.0");
        element12.setName("SysSnmpTrapComm");
        element12.setDataType("OctetString");
        element12.setUsability(true);
        element12.setRewritable(true);
        resultList.add(element12);

        Element element13 = new Element();
        element13.setOid("1.3.6.1.4.1.17484.2.1.11.0");
        element13.setName("Restart");
        element13.setDataType("Integer");
        element13.setUsability(true);
        element13.setRewritable(true);
        resultList.add(element13);

        Element element21 = new Element();
        element21.setOid("1.3.6.1.4.1.17484.2.2.2.1.1.1");
        element21.setName("PinC1");
        element21.setDataType("Integer");
        element21.setUsability(true);
        element21.setRewritable(true);
        resultList.add(element21);

        Element element22 = new Element();
        element22.setOid("1.3.6.1.4.1.17484.2.2.2.1.1.2");
        element22.setName("PinC2");
        element22.setDataType("Integer");
        element22.setUsability(true);
        element22.setRewritable(true);
        resultList.add(element22);

        Element element23 = new Element();
        element23.setOid("1.3.6.1.4.1.17484.2.2.2.1.1.3");
        element23.setName("PinC3");
        element23.setDataType("Integer");
        element23.setUsability(true);
        element23.setRewritable(true);
        resultList.add(element23);

        Element element24 = new Element();
        element24.setOid("1.3.6.1.4.1.17484.2.2.2.1.1.4");
        element24.setName("PinC4");
        element24.setDataType("Integer");
        element24.setUsability(true);
        element24.setRewritable(true);
        resultList.add(element24);

        Element element25 = new Element();
        element25.setOid("1.3.6.1.4.1.17484.2.2.2.1.1.5");
        element25.setName("PinC5");
        element25.setDataType("Integer");
        element25.setUsability(true);
        element25.setRewritable(true);
        resultList.add(element25);

        Element element26 = new Element();
        element26.setOid("1.3.6.1.4.1.17484.2.2.2.1.1.6");
        element26.setName("PinC6");
        element26.setDataType("Integer");
        element26.setUsability(true);
        element26.setRewritable(true);
        resultList.add(element26);

        Element element27 = new Element();
        element27.setOid("1.3.6.1.4.1.17484.2.2.2.1.1.7");
        element27.setName("PinC7");
        element27.setDataType("Integer");
        element27.setUsability(true);
        element27.setRewritable(true);
        resultList.add(element27);

        Element element28 = new Element();
        element28.setOid("1.3.6.1.4.1.17484.2.2.2.1.1.8");
        element28.setName("PinC8");
        element28.setDataType("Integer");
        element28.setUsability(true);
        element28.setRewritable(true);
        resultList.add(element28);

        Element element31 = new Element();
        element31.setOid("1.3.6.1.4.1.17484.2.2.2.1.2.1");
        element31.setName("DDRC1");
        element31.setDataType("Integer");
        element31.setUsability(true);
        element31.setRewritable(true);
        resultList.add(element31);

        Element element32 = new Element();
        element32.setOid("1.3.6.1.4.1.17484.2.2.2.1.2.2");
        element32.setName("DDRC2");
        element32.setDataType("Integer");
        element32.setUsability(true);
        element32.setRewritable(true);
        resultList.add(element32);

        Element element33 = new Element();
        element33.setOid("1.3.6.1.4.1.17484.2.2.2.1.2.3");
        element33.setName("DDRC3");
        element33.setDataType("Integer");
        element33.setUsability(true);
        element33.setRewritable(true);
        resultList.add(element33);

        Element element34 = new Element();
        element34.setOid("1.3.6.1.4.1.17484.2.2.2.1.2.4");
        element34.setName("DDRC4");
        element34.setDataType("Integer");
        element34.setUsability(true);
        element34.setRewritable(true);
        resultList.add(element34);

        Element element35 = new Element();
        element35.setOid("1.3.6.1.4.1.17484.2.2.2.1.2.5");
        element35.setName("DDRC5");
        element35.setDataType("Integer");
        element35.setUsability(true);
        element35.setRewritable(true);
        resultList.add(element35);

        Element element36 = new Element();
        element36.setOid("1.3.6.1.4.1.17484.2.2.2.1.2.6");
        element36.setName("DDRC6");
        element36.setDataType("Integer");
        element36.setUsability(true);
        element36.setRewritable(true);
        resultList.add(element36);

        Element element37 = new Element();
        element37.setOid("1.3.6.1.4.1.17484.2.2.2.1.2.7");
        element37.setName("DDRC7");
        element37.setDataType("Integer");
        element37.setUsability(true);
        element37.setRewritable(true);
        resultList.add(element37);

        Element element38 = new Element();
        element38.setOid("1.3.6.1.4.1.17484.2.2.2.1.2.8");
        element38.setName("DDRC8");
        element38.setDataType("Integer");
        element38.setUsability(true);
        element38.setRewritable(true);
        resultList.add(element38);

        Element element41 = new Element();
        element41.setOid("1.3.6.1.4.1.17484.2.2.2.1.3.1");
        element41.setName("PortC1");
        element41.setDataType("Integer");
        element41.setUsability(true);
        element41.setRewritable(true);
        resultList.add(element41);

        Element element42 = new Element();
        element42.setOid("1.3.6.1.4.1.17484.2.2.2.1.3.2");
        element42.setName("PortC2");
        element42.setDataType("Integer");
        element42.setUsability(true);
        element42.setRewritable(true);
        resultList.add(element42);

        Element element43 = new Element();
        element43.setOid("1.3.6.1.4.1.17484.2.2.2.1.3.3");
        element43.setName("PortC3");
        element43.setDataType("Integer");
        element43.setUsability(true);
        element43.setRewritable(true);
        resultList.add(element43);

        Element element44 = new Element();
        element44.setOid("1.3.6.1.4.1.17484.2.2.2.1.3.4");
        element44.setName("PortC4");
        element44.setDataType("Integer");
        element44.setUsability(true);
        element44.setRewritable(true);
        resultList.add(element44);

        Element element45 = new Element();
        element45.setOid("1.3.6.1.4.1.17484.2.2.2.1.3.5");
        element45.setName("PortC5");
        element45.setDataType("Integer");
        element45.setUsability(true);
        element45.setRewritable(true);
        resultList.add(element45);

        Element element46 = new Element();
        element46.setOid("1.3.6.1.4.1.17484.2.2.2.1.3.6");
        element46.setName("PortC6");
        element46.setDataType("Integer");
        element46.setUsability(true);
        element46.setRewritable(true);
        resultList.add(element46);

        Element element47 = new Element();
        element47.setOid("1.3.6.1.4.1.17484.2.2.2.1.3.7");
        element47.setName("PortC7");
        element47.setDataType("Integer");
        element47.setUsability(true);
        element47.setRewritable(true);
        resultList.add(element47);

        Element element48 = new Element();
        element48.setOid("1.3.6.1.4.1.17484.2.2.2.1.3.8");
        element48.setName("PortC8");
        element48.setDataType("Integer");
        element48.setUsability(true);
        element48.setRewritable(true);
        resultList.add(element48);

        Element element51 = new Element();
        element51.setOid("1.3.6.1.4.1.17484.2.2.2.1.4.1");
        element51.setName("PinE1");
        element51.setDataType("Integer");
        element51.setUsability(true);
        element51.setRewritable(true);
        resultList.add(element51);

        Element element52 = new Element();
        element52.setOid("1.3.6.1.4.1.17484.2.2.2.1.4.2");
        element52.setName("PinE2");
        element52.setDataType("Integer");
        element52.setUsability(true);
        element52.setRewritable(true);
        resultList.add(element52);

        Element element53 = new Element();
        element53.setOid("1.3.6.1.4.1.17484.2.2.2.1.4.3");
        element53.setName("PinE3");
        element53.setDataType("Integer");
        element53.setUsability(true);
        element53.setRewritable(true);
        resultList.add(element53);

        Element element54 = new Element();
        element54.setOid("1.3.6.1.4.1.17484.2.2.2.1.4.4");
        element54.setName("PinE4");
        element54.setDataType("Integer");
        element54.setUsability(true);
        element54.setRewritable(true);
        resultList.add(element54);

        Element element55 = new Element();
        element55.setOid("1.3.6.1.4.1.17484.2.2.2.1.4.5");
        element55.setName("PinE5");
        element55.setDataType("Integer");
        element55.setUsability(true);
        element55.setRewritable(true);
        resultList.add(element55);

        Element element56 = new Element();
        element56.setOid("1.3.6.1.4.1.17484.2.2.2.1.4.6");
        element56.setName("PinE6");
        element56.setDataType("Integer");
        element56.setUsability(true);
        element56.setRewritable(true);
        resultList.add(element56);

        Element element57 = new Element();
        element57.setOid("1.3.6.1.4.1.17484.2.2.2.1.4.7");
        element57.setName("PinE7");
        element57.setDataType("Integer");
        element57.setUsability(true);
        element57.setRewritable(true);
        resultList.add(element57);

        Element element58 = new Element();
        element58.setOid("1.3.6.1.4.1.17484.2.2.2.1.4.8");
        element58.setName("PinE8");
        element58.setDataType("Integer");
        element58.setUsability(true);
        element58.setRewritable(true);
        resultList.add(element58);

        Element element61 = new Element();
        element61.setOid("1.3.6.1.4.1.17484.2.2.2.1.5.1");
        element61.setName("DDRE1");
        element61.setDataType("Integer");
        element61.setUsability(true);
        element61.setRewritable(true);
        resultList.add(element61);

        Element element62 = new Element();
        element62.setOid("1.3.6.1.4.1.17484.2.2.2.1.5.2");
        element62.setName("DDRE2");
        element62.setDataType("Integer");
        element62.setUsability(true);
        element62.setRewritable(true);
        resultList.add(element62);

        Element element63 = new Element();
        element63.setOid("1.3.6.1.4.1.17484.2.2.2.1.5.3");
        element63.setName("DDRE3");
        element63.setDataType("Integer");
        element63.setUsability(true);
        element63.setRewritable(true);
        resultList.add(element63);

        Element element64 = new Element();
        element64.setOid("1.3.6.1.4.1.17484.2.2.2.1.5.4");
        element64.setName("DDRE4");
        element64.setDataType("Integer");
        element64.setUsability(true);
        element64.setRewritable(true);
        resultList.add(element64);

        Element element65 = new Element();
        element65.setOid("1.3.6.1.4.1.17484.2.2.2.1.5.5");
        element65.setName("DDRE5");
        element65.setDataType("Integer");
        element65.setUsability(true);
        element65.setRewritable(true);
        resultList.add(element65);

        Element element66 = new Element();
        element66.setOid("1.3.6.1.4.1.17484.2.2.2.1.5.6");
        element66.setName("DDRE6");
        element66.setDataType("Integer");
        element66.setUsability(true);
        element66.setRewritable(true);
        resultList.add(element66);

        Element element67 = new Element();
        element67.setOid("1.3.6.1.4.1.17484.2.2.2.1.5.7");
        element67.setName("DDRE7");
        element67.setDataType("Integer");
        element67.setUsability(true);
        element67.setRewritable(true);
        resultList.add(element67);

        Element element68 = new Element();
        element68.setOid("1.3.6.1.4.1.17484.2.2.2.1.5.8");
        element68.setName("DDRE8");
        element68.setDataType("Integer");
        element68.setUsability(true);
        element68.setRewritable(true);
        resultList.add(element68);

        Element element71 = new Element();
        element71.setOid("1.3.6.1.4.1.17484.2.2.2.1.6.1");
        element71.setName("PortE1");
        element71.setDataType("Integer");
        element71.setUsability(true);
        element71.setRewritable(true);
        resultList.add(element71);

        Element element72 = new Element();
        element72.setOid("1.3.6.1.4.1.17484.2.2.2.1.6.2");
        element72.setName("PortE2");
        element72.setDataType("Integer");
        element72.setUsability(true);
        element72.setRewritable(true);
        resultList.add(element72);

        Element element73 = new Element();
        element73.setOid("1.3.6.1.4.1.17484.2.2.2.1.6.3");
        element73.setName("PortE3");
        element73.setDataType("Integer");
        element73.setUsability(true);
        element73.setRewritable(true);
        resultList.add(element73);

        Element element74 = new Element();
        element74.setOid("1.3.6.1.4.1.17484.2.2.2.1.6.4");
        element74.setName("PortE4");
        element74.setDataType("Integer");
        element74.setUsability(true);
        element74.setRewritable(true);
        resultList.add(element74);

        Element element75 = new Element();
        element75.setOid("1.3.6.1.4.1.17484.2.2.2.1.6.5");
        element75.setName("PortE5");
        element75.setDataType("Integer");
        element75.setUsability(true);
        element75.setRewritable(true);
        resultList.add(element75);

        Element element76 = new Element();
        element76.setOid("1.3.6.1.4.1.17484.2.2.2.1.6.6");
        element76.setName("PortE6");
        element76.setDataType("Integer");
        element76.setUsability(true);
        element76.setRewritable(true);
        resultList.add(element76);

        Element element77 = new Element();
        element77.setOid("1.3.6.1.4.1.17484.2.2.2.1.6.7");
        element77.setName("PortE7");
        element77.setDataType("Integer");
        element77.setUsability(true);
        element77.setRewritable(true);
        resultList.add(element77);

        Element element78 = new Element();
        element78.setOid("1.3.6.1.4.1.17484.2.2.2.1.6.8");
        element78.setName("PortE8");
        element78.setDataType("Integer");
        element78.setUsability(true);
        element78.setRewritable(true);
        resultList.add(element78);

        Element element80 = new Element();
        element80.setOid("1.3.6.1.4.1.17484.2.5.1.0");
        element80.setName("R-LED");
        element80.setDataType("Integer");
        element80.setUsability(true);
        element80.setRewritable(true);
        resultList.add(element80);

        Element element81 = new Element();
        element81.setOid("1.3.6.1.4.1.17484.2.5.2.0");
        element81.setName("G-LED");
        element81.setDataType("Integer");
        element81.setUsability(true);
        element81.setRewritable(true);
        resultList.add(element81);

        Element element82 = new Element();
        element82.setOid("1.3.6.1.4.1.17484.2.4.1.0");
        element82.setName("ACswitch0");
        element82.setDataType("Integer");
        element82.setUsability(true);
        element82.setRewritable(true);
        resultList.add(element82);

        Element element83 = new Element();
        element83.setOid("1.3.6.1.4.1.17484.2.4.2.0");
        element83.setName("DCswitch0");
        element83.setDataType("Integer");
        element83.setUsability(true);
        element83.setRewritable(true);
        resultList.add(element83);

        Element element84 = new Element();
        element84.setOid("1.3.6.1.4.1.17484.2.4.3.0");
        element84.setName("DCswitch1");
        element84.setDataType("Integer");
        element84.setUsability(true);
        element84.setRewritable(true);
        resultList.add(element84);

        Element element85 = new Element();
        element85.setOid("1.3.6.1.4.1.17484.2.4.4.0");
        element85.setName("DCswitch2");
        element85.setDataType("Integer");
        element85.setUsability(true);
        element85.setRewritable(true);
        resultList.add(element85);

        Element element86 = new Element();
        element86.setOid("1.3.6.1.4.1.17484.2.4.5.0");
        element86.setName("DCswitch3");
        element86.setDataType("Integer");
        element86.setUsability(true);
        element86.setRewritable(true);
        resultList.add(element86);

        Element element87 = new Element();
        element87.setOid("1.3.6.1.4.1.17484.2.3.1.0");
        element87.setName("AlarmIn0");
        element87.setDataType("Integer");
        element87.setUsability(true);
        element87.setRewritable(false);
        resultList.add(element87);

        Element element88 = new Element();
        element88.setOid("1.3.6.1.4.1.17484.2.3.2.0");
        element88.setName("AlarmIn1");
        element88.setDataType("Integer");
        element88.setUsability(true);
        element88.setRewritable(false);
        resultList.add(element88);

        Element element89 = new Element();
        element89.setOid("1.3.6.1.4.1.17484.2.3.3.0");
        element89.setName("AlarmIn2");
        element89.setDataType("Integer");
        element89.setUsability(true);
        element89.setRewritable(false);
        resultList.add(element89);

        Element element90 = new Element();
        element90.setOid("1.3.6.1.4.1.17484.2.3.4.0");
        element90.setName("AlarmIn3");
        element90.setDataType("Integer");
        element90.setUsability(true);
        element90.setRewritable(false);
        resultList.add(element90);

        Element element91 = new Element();
        element91.setOid("1.3.6.1.4.1.17484.2.3.5.0");
        element91.setName("AlarmIn4");
        element91.setDataType("Integer");
        element91.setUsability(true);
        element91.setRewritable(false);
        resultList.add(element91);

        Element element92 = new Element();
        element92.setOid("1.3.6.1.4.1.17484.2.3.6.0");
        element92.setName("AlarmOut0");
        element92.setDataType("Integer");
        element92.setUsability(true);
        element92.setRewritable(true);
        resultList.add(element92);

        Element element93 = new Element();
        element93.setOid("1.3.6.1.4.1.17484.2.3.7.0");
        element93.setName("AlarmOut1");
        element93.setDataType("Integer");
        element93.setUsability(true);
        element93.setRewritable(true);
        resultList.add(element93);

        Element element94 = new Element();
        element94.setOid("1.3.6.1.4.1.17484.2.3.8.0");
        element94.setName("AlarmOut2");
        element94.setDataType("Integer");
        element94.setUsability(true);
        element94.setRewritable(true);
        resultList.add(element94);

        Element element95 = new Element();
        element95.setOid("1.3.6.1.4.1.17484.2.3.9.0");
        element95.setName("AlarmTrapVar");
        element95.setDataType("Integer");
        element95.setUsability(true);
        element95.setRewritable(false);
        resultList.add(element95);

        Element element96 = new Element();
        element96.setOid("1.3.6.1.4.1.17484.2.3.10.0");
        element96.setName("AlarmStatusVar");
        element96.setDataType("Integer");
        element96.setUsability(true);
        element96.setRewritable(false);
        resultList.add(element96);

        Element element97 = new Element();
        element97.setOid("1.3.6.1.4.1.17484.2.3.11.0");
        element97.setName("AlarmSoftArmed");
        element97.setDataType("Integer");
        element97.setUsability(true);
        element97.setRewritable(true);
        resultList.add(element97);

        Element element98 = new Element();
        element98.setOid("1.3.6.1.4.1.17484.2.3.12.0");
        element98.setName("AlarmSoftDisArm");
        element98.setDataType("Integer");
        element98.setUsability(true);
        element98.setRewritable(true);
        resultList.add(element98);

        Element element99 = new Element();
        element99.setOid("1.3.6.1.4.1.17484.2.3.13.0");
        element99.setName("AlarmMaskZone1");
        element99.setDataType("Integer");
        element99.setUsability(true);
        element99.setRewritable(true);
        resultList.add(element99);

        Element element100 = new Element();
        element100.setOid("1.3.6.1.4.1.17484.2.3.14.0");
        element100.setName("AlarmMaskZone2");
        element100.setDataType("Integer");
        element100.setUsability(true);
        element100.setRewritable(true);
        resultList.add(element100);

        Element element101 = new Element();
        element101.setOid("1.3.6.1.4.1.17484.2.3.15.0");
        element101.setName("AlarmMaskZone3");
        element101.setDataType("Integer");
        element101.setUsability(true);
        element101.setRewritable(true);
        resultList.add(element101);

        Element element111 = new Element();
        element111.setOid("1.3.6.1.4.1.17484.2.6.2.1.1.1");
        element111.setName("Temperature Value1");
        element111.setDataType("Integer");
        element111.setUsability(true);
        element111.setRewritable(false);
        resultList.add(element111);

        Element element121 = new Element();
        element121.setOid("1.3.6.1.4.1.17484.2.6.2.1.2.1");
        element121.setName("ROM content1");
        element121.setDataType("Integer");
        element121.setUsability(true);
        element121.setRewritable(false);
        resultList.add(element121);

        Element element112 = new Element();
        element112.setOid("1.3.6.1.4.1.17484.2.6.2.1.1.2");
        element112.setName("Temperature Value2");
        element112.setDataType("Integer");
        element112.setUsability(true);
        element112.setRewritable(false);
        resultList.add(element112);

        Element element122 = new Element();
        element122.setOid("1.3.6.1.4.1.17484.2.6.2.1.2.2");
        element122.setName("ROM content2");
        element122.setDataType("Integer");
        element122.setUsability(true);
        element122.setRewritable(false);
        resultList.add(element122);

        Element element113 = new Element();
        element113.setOid("1.3.6.1.4.1.17484.2.6.2.1.1.3");
        element113.setName("Temperature Value3");
        element113.setDataType("Integer");
        element113.setUsability(true);
        element113.setRewritable(false);
        resultList.add(element113);

        Element element123 = new Element();
        element123.setOid("1.3.6.1.4.1.17484.2.6.2.1.2.3");
        element123.setName("ROM content3");
        element123.setDataType("Integer");
        element123.setUsability(true);
        element123.setRewritable(false);
        resultList.add(element123);

        Element element114 = new Element();
        element114.setOid("1.3.6.1.4.1.17484.2.6.2.1.1.4");
        element114.setName("Temperature Value4");
        element114.setDataType("Integer");
        element114.setUsability(true);
        element114.setRewritable(false);
        resultList.add(element114);

        Element element124 = new Element();
        element124.setOid("1.3.6.1.4.1.17484.2.6.2.1.2.4");
        element124.setName("ROM content4");
        element124.setDataType("Integer");
        element124.setUsability(true);
        element124.setRewritable(false);
        resultList.add(element124);

        Element element115 = new Element();
        element115.setOid("1.3.6.1.4.1.17484.2.6.2.1.1.5");
        element115.setName("Temperature Value5");
        element115.setDataType("Integer");
        element115.setUsability(true);
        element115.setRewritable(false);
        resultList.add(element115);

        Element element125 = new Element();
        element125.setOid("1.3.6.1.4.1.17484.2.6.2.1.2.5");
        element125.setName("ROM content5");
        element125.setDataType("Integer");
        element125.setUsability(true);
        element125.setRewritable(false);
        resultList.add(element125);

        Element element116 = new Element();
        element116.setOid("1.3.6.1.4.1.17484.2.6.2.1.1.6");
        element116.setName("Temperature Value6");
        element116.setDataType("Integer");
        element116.setUsability(true);
        element116.setRewritable(false);
        resultList.add(element116);

        Element element126 = new Element();
        element126.setOid("1.3.6.1.4.1.17484.2.6.2.1.2.6");
        element126.setName("ROM content6");
        element126.setDataType("Integer");
        element126.setUsability(true);
        element126.setRewritable(false);
        resultList.add(element126);

        Element element117 = new Element();
        element117.setOid("1.3.6.1.4.1.17484.2.6.2.1.1.7");
        element117.setName("Temperature Value7");
        element117.setDataType("Integer");
        element117.setUsability(true);
        element117.setRewritable(false);
        resultList.add(element117);

        Element element127 = new Element();
        element127.setOid("1.3.6.1.4.1.17484.2.6.2.1.2.7");
        element127.setName("ROM content7");
        element127.setDataType("Integer");
        element127.setUsability(true);
        element127.setRewritable(false);
        resultList.add(element127);

        Element element118 = new Element();
        element118.setOid("1.3.6.1.4.1.17484.2.6.2.1.1.8");
        element118.setName("Temperature Value8");
        element118.setDataType("Integer");
        element118.setUsability(true);
        element118.setRewritable(false);
        resultList.add(element118);

        Element element128 = new Element();
        element128.setOid("1.3.6.1.4.1.17484.2.6.2.1.2.8");
        element128.setName("ROM content8");
        element128.setDataType("Integer");
        element128.setUsability(true);
        element128.setRewritable(false);
        resultList.add(element128);

        Element element131 = new Element();
        element131.setOid("1.3.6.1.4.1.17484.2.9.2.1.1.1");
        element131.setName("tUP Value1");
        element131.setDataType("Integer");
        element131.setUsability(true);
        element131.setRewritable(true);
        resultList.add(element131);

        Element element132 = new Element();
        element132.setOid("1.3.6.1.4.1.17484.2.9.2.1.1.2");
        element132.setName("tUP Value2");
        element132.setDataType("Integer");
        element132.setUsability(true);
        element132.setRewritable(true);
        resultList.add(element132);

        Element element133 = new Element();
        element133.setOid("1.3.6.1.4.1.17484.2.9.2.1.1.3");
        element133.setName("tUP Value3");
        element133.setDataType("Integer");
        element133.setUsability(true);
        element133.setRewritable(true);
        resultList.add(element133);

        Element element134 = new Element();
        element134.setOid("1.3.6.1.4.1.17484.2.9.2.1.1.4");
        element134.setName("tUP Value4");
        element134.setDataType("Integer");
        element134.setUsability(true);
        element134.setRewritable(true);
        resultList.add(element134);

        Element element135 = new Element();
        element135.setOid("1.3.6.1.4.1.17484.2.9.2.1.1.5");
        element135.setName("tUP Value5");
        element135.setDataType("Integer");
        element135.setUsability(true);
        element135.setRewritable(true);
        resultList.add(element135);

        Element element136 = new Element();
        element136.setOid("1.3.6.1.4.1.17484.2.9.2.1.1.6");
        element136.setName("tUP Value6");
        element136.setDataType("Integer");
        element136.setUsability(true);
        element136.setRewritable(true);
        resultList.add(element136);

        Element element137 = new Element();
        element137.setOid("1.3.6.1.4.1.17484.2.9.2.1.1.7");
        element137.setName("tUP Value7");
        element137.setDataType("Integer");
        element137.setUsability(true);
        element137.setRewritable(true);
        resultList.add(element137);

        Element element138 = new Element();
        element138.setOid("1.3.6.1.4.1.17484.2.9.2.1.1.8");
        element138.setName("tUP Value8");
        element138.setDataType("Integer");
        element138.setUsability(true);
        element138.setRewritable(true);
        resultList.add(element138);

        Element element141 = new Element();
        element141.setOid("1.3.6.1.4.1.17484.2.9.2.1.2.1");
        element141.setName("tDWN Value1");
        element141.setDataType("Integer");
        element141.setUsability(true);
        element141.setRewritable(true);
        resultList.add(element141);

        Element element142 = new Element();
        element142.setOid("1.3.6.1.4.1.17484.2.9.2.1.2.2");
        element142.setName("tDWN Value2");
        element142.setDataType("Integer");
        element142.setUsability(true);
        element142.setRewritable(true);
        resultList.add(element142);

        Element element143 = new Element();
        element143.setOid("1.3.6.1.4.1.17484.2.9.2.1.2.3");
        element143.setName("tDWN Value3");
        element143.setDataType("Integer");
        element143.setUsability(true);
        element143.setRewritable(true);
        resultList.add(element143);

        Element element144 = new Element();
        element144.setOid("1.3.6.1.4.1.17484.2.9.2.1.2.4");
        element144.setName("tDWN Value4");
        element144.setDataType("Integer");
        element144.setUsability(true);
        element144.setRewritable(true);
        resultList.add(element144);

        Element element145 = new Element();
        element145.setOid("1.3.6.1.4.1.17484.2.9.2.1.2.5");
        element145.setName("tDWN Value5");
        element145.setDataType("Integer");
        element145.setUsability(true);
        element145.setRewritable(true);
        resultList.add(element145);

        Element element146 = new Element();
        element146.setOid("1.3.6.1.4.1.17484.2.9.2.1.2.6");
        element146.setName("tDWN Value6");
        element146.setDataType("Integer");
        element146.setUsability(true);
        element146.setRewritable(true);
        resultList.add(element146);

        Element element147 = new Element();
        element147.setOid("1.3.6.1.4.1.17484.2.9.2.1.2.7");
        element147.setName("tDWN Value7");
        element147.setDataType("Integer");
        element147.setUsability(true);
        element147.setRewritable(true);
        resultList.add(element147);

        Element element148 = new Element();
        element148.setOid("1.3.6.1.4.1.17484.2.9.2.1.2.8");
        element148.setName("tDWN Value8");
        element148.setDataType("Integer");
        element148.setUsability(true);
        element148.setRewritable(true);
        resultList.add(element148);

        Element element151 = new Element();
        element151.setOid("1.3.6.1.4.1.17484.2.9.2.1.3.1");
        element151.setName("DcSw0UpAction1");
        element151.setDataType("Integer");
        element151.setUsability(true);
        element151.setRewritable(true);
        resultList.add(element151);

        Element element152 = new Element();
        element152.setOid("1.3.6.1.4.1.17484.2.9.2.1.3.2");
        element152.setName("DcSw0UpAction2");
        element152.setDataType("Integer");
        element152.setUsability(true);
        element152.setRewritable(true);
        resultList.add(element152);

        Element element153 = new Element();
        element153.setOid("1.3.6.1.4.1.17484.2.9.2.1.3.3");
        element153.setName("DcSw0UpAction3");
        element153.setDataType("Integer");
        element153.setUsability(true);
        element153.setRewritable(true);
        resultList.add(element153);

        Element element154 = new Element();
        element154.setOid("1.3.6.1.4.1.17484.2.9.2.1.3.4");
        element154.setName("DcSw0UpAction4");
        element154.setDataType("Integer");
        element154.setUsability(true);
        element154.setRewritable(true);
        resultList.add(element154);

        Element element155 = new Element();
        element155.setOid("1.3.6.1.4.1.17484.2.9.2.1.3.5");
        element155.setName("DcSw0UpAction5");
        element155.setDataType("Integer");
        element155.setUsability(true);
        element155.setRewritable(true);
        resultList.add(element155);

        Element element156 = new Element();
        element156.setOid("1.3.6.1.4.1.17484.2.9.2.1.3.6");
        element156.setName("DcSw0UpAction6");
        element156.setDataType("Integer");
        element156.setUsability(true);
        element156.setRewritable(true);
        resultList.add(element156);

        Element element157 = new Element();
        element157.setOid("1.3.6.1.4.1.17484.2.9.2.1.3.7");
        element157.setName("DcSw0UpAction7");
        element157.setDataType("Integer");
        element157.setUsability(true);
        element157.setRewritable(true);
        resultList.add(element157);

        Element element158 = new Element();
        element158.setOid("1.3.6.1.4.1.17484.2.9.2.1.3.8");
        element158.setName("DcSw0UpAction8");
        element158.setDataType("Integer");
        element158.setUsability(true);
        element158.setRewritable(true);
        resultList.add(element158);

        Element element161 = new Element();
        element161.setOid("1.3.6.1.4.1.17484.2.9.2.1.4.1");
        element161.setName("DcSw0UpValue1");
        element161.setDataType("Integer");
        element161.setUsability(true);
        element161.setRewritable(true);
        resultList.add(element161);

        Element element162 = new Element();
        element162.setOid("1.3.6.1.4.1.17484.2.9.2.1.4.2");
        element162.setName("DcSw0UpValue2");
        element162.setDataType("Integer");
        element162.setUsability(true);
        element162.setRewritable(true);
        resultList.add(element162);

        Element element163 = new Element();
        element163.setOid("1.3.6.1.4.1.17484.2.9.2.1.4.3");
        element163.setName("DcSw0UpValue3");
        element163.setDataType("Integer");
        element163.setUsability(true);
        element163.setRewritable(true);
        resultList.add(element163);

        Element element164 = new Element();
        element164.setOid("1.3.6.1.4.1.17484.2.9.2.1.4.4");
        element164.setName("DcSw0UpValue4");
        element164.setDataType("Integer");
        element164.setUsability(true);
        element164.setRewritable(true);
        resultList.add(element164);

        Element element165 = new Element();
        element165.setOid("1.3.6.1.4.1.17484.2.9.2.1.4.5");
        element165.setName("DcSw0UpValue5");
        element165.setDataType("Integer");
        element165.setUsability(true);
        element165.setRewritable(true);
        resultList.add(element165);

        Element element166 = new Element();
        element166.setOid("1.3.6.1.4.1.17484.2.9.2.1.4.6");
        element166.setName("DcSw0UpValue6");
        element166.setDataType("Integer");
        element166.setUsability(true);
        element166.setRewritable(true);
        resultList.add(element166);

        Element element167 = new Element();
        element167.setOid("1.3.6.1.4.1.17484.2.9.2.1.4.7");
        element167.setName("DcSw0UpValue7");
        element167.setDataType("Integer");
        element167.setUsability(true);
        element167.setRewritable(true);
        resultList.add(element167);

        Element element168 = new Element();
        element168.setOid("1.3.6.1.4.1.17484.2.9.2.1.4.8");
        element168.setName("DcSw0UpValue8");
        element168.setDataType("Integer");
        element168.setUsability(true);
        element168.setRewritable(true);
        resultList.add(element168);

        Element element171 = new Element();
        element171.setOid("1.3.6.1.4.1.17484.2.9.2.1.5.1");
        element171.setName("DcSw0DwnAction1");
        element171.setDataType("Integer");
        element171.setUsability(true);
        element171.setRewritable(true);
        resultList.add(element171);

        Element element172 = new Element();
        element172.setOid("1.3.6.1.4.1.17484.2.9.2.1.5.2");
        element172.setName("DcSw0DwnAction2");
        element172.setDataType("Integer");
        element172.setUsability(true);
        element172.setRewritable(true);
        resultList.add(element172);

        Element element173 = new Element();
        element173.setOid("1.3.6.1.4.1.17484.2.9.2.1.5.3");
        element173.setName("DcSw0DwnAction3");
        element173.setDataType("Integer");
        element173.setUsability(true);
        element173.setRewritable(true);
        resultList.add(element173);

        Element element174 = new Element();
        element174.setOid("1.3.6.1.4.1.17484.2.9.2.1.5.4");
        element174.setName("DcSw0DwnAction4");
        element174.setDataType("Integer");
        element174.setUsability(true);
        element174.setRewritable(true);
        resultList.add(element174);

        Element element175 = new Element();
        element175.setOid("1.3.6.1.4.1.17484.2.9.2.1.5.5");
        element175.setName("DcSw0DwnAction5");
        element175.setDataType("Integer");
        element175.setUsability(true);
        element175.setRewritable(true);
        resultList.add(element175);

        Element element176 = new Element();
        element176.setOid("1.3.6.1.4.1.17484.2.9.2.1.5.6");
        element176.setName("DcSw0DwnAction6");
        element176.setDataType("Integer");
        element176.setUsability(true);
        element176.setRewritable(true);
        resultList.add(element176);

        Element element177 = new Element();
        element177.setOid("1.3.6.1.4.1.17484.2.9.2.1.5.7");
        element177.setName("DcSw0DwnAction7");
        element177.setDataType("Integer");
        element177.setUsability(true);
        element177.setRewritable(true);
        resultList.add(element177);

        Element element178 = new Element();
        element178.setOid("1.3.6.1.4.1.17484.2.9.2.1.5.8");
        element178.setName("DcSw0DwnAction8");
        element178.setDataType("Integer");
        element178.setUsability(true);
        element178.setRewritable(true);
        resultList.add(element178);

        Element element181 = new Element();
        element181.setOid("1.3.6.1.4.1.17484.2.9.2.1.6.1");
        element181.setName("DcSw0DwnValue1");
        element181.setDataType("Integer");
        element181.setUsability(true);
        element181.setRewritable(true);
        resultList.add(element181);

        Element element182 = new Element();
        element182.setOid("1.3.6.1.4.1.17484.2.9.2.1.6.2");
        element182.setName("DcSw0DwnValue2");
        element182.setDataType("Integer");
        element182.setUsability(true);
        element182.setRewritable(true);
        resultList.add(element182);

        Element element183 = new Element();
        element183.setOid("1.3.6.1.4.1.17484.2.9.2.1.6.3");
        element183.setName("DcSw0DwnValue3");
        element183.setDataType("Integer");
        element183.setUsability(true);
        element183.setRewritable(true);
        resultList.add(element183);

        Element element184 = new Element();
        element184.setOid("1.3.6.1.4.1.17484.2.9.2.1.6.4");
        element184.setName("DcSw0DwnValue4");
        element184.setDataType("Integer");
        element184.setUsability(true);
        element184.setRewritable(true);
        resultList.add(element184);

        Element element185 = new Element();
        element185.setOid("1.3.6.1.4.1.17484.2.9.2.1.6.5");
        element185.setName("DcSw0DwnValue5");
        element185.setDataType("Integer");
        element185.setUsability(true);
        element185.setRewritable(true);
        resultList.add(element185);

        Element element186 = new Element();
        element186.setOid("1.3.6.1.4.1.17484.2.9.2.1.6.6");
        element186.setName("DcSw0DwnValue6");
        element186.setDataType("Integer");
        element186.setUsability(true);
        element186.setRewritable(true);
        resultList.add(element186);

        Element element187 = new Element();
        element187.setOid("1.3.6.1.4.1.17484.2.9.2.1.6.7");
        element187.setName("DcSw0DwnValue7");
        element187.setDataType("Integer");
        element187.setUsability(true);
        element187.setRewritable(true);
        resultList.add(element187);

        Element element188 = new Element();
        element188.setOid("1.3.6.1.4.1.17484.2.9.2.1.6.8");
        element188.setName("DcSw0DwnValue8");
        element188.setDataType("Integer");
        element188.setUsability(true);
        element188.setRewritable(true);
        resultList.add(element188);

        Element element191 = new Element();
        element191.setOid("1.3.6.1.4.1.17484.2.9.2.1.7.1");
        element191.setName("DcSw1UpAction1");
        element191.setDataType("Integer");
        element191.setUsability(true);
        element191.setRewritable(true);
        resultList.add(element191);

        Element element192 = new Element();
        element192.setOid("1.3.6.1.4.1.17484.2.9.2.1.7.2");
        element192.setName("DcSw1UpAction2");
        element192.setDataType("Integer");
        element192.setUsability(true);
        element192.setRewritable(true);
        resultList.add(element192);

        Element element193 = new Element();
        element193.setOid("1.3.6.1.4.1.17484.2.9.2.1.7.3");
        element193.setName("DcSw1UpAction3");
        element193.setDataType("Integer");
        element193.setUsability(true);
        element193.setRewritable(true);
        resultList.add(element193);

        Element element194 = new Element();
        element194.setOid("1.3.6.1.4.1.17484.2.9.2.1.7.4");
        element194.setName("DcSw1UpAction4");
        element194.setDataType("Integer");
        element194.setUsability(true);
        element194.setRewritable(true);
        resultList.add(element194);

        Element element195 = new Element();
        element195.setOid("1.3.6.1.4.1.17484.2.9.2.1.7.5");
        element195.setName("DcSw1UpAction5");
        element195.setDataType("Integer");
        element195.setUsability(true);
        element195.setRewritable(true);
        resultList.add(element195);

        Element element196 = new Element();
        element196.setOid("1.3.6.1.4.1.17484.2.9.2.1.7.6");
        element196.setName("DcSw1UpAction6");
        element196.setDataType("Integer");
        element196.setUsability(true);
        element196.setRewritable(true);
        resultList.add(element196);

        Element element197 = new Element();
        element197.setOid("1.3.6.1.4.1.17484.2.9.2.1.7.7");
        element197.setName("DcSw1UpAction7");
        element197.setDataType("Integer");
        element197.setUsability(true);
        element197.setRewritable(true);
        resultList.add(element197);

        Element element198 = new Element();
        element198.setOid("1.3.6.1.4.1.17484.2.9.2.1.7.8");
        element198.setName("DcSw1UpAction8");
        element198.setDataType("Integer");
        element198.setUsability(true);
        element198.setRewritable(true);
        resultList.add(element198);

        Element element201 = new Element();
        element201.setOid("1.3.6.1.4.1.17484.2.9.2.1.8.1");
        element201.setName("DcSw1UpValue1");
        element201.setDataType("Integer");
        element201.setUsability(true);
        element201.setRewritable(true);
        resultList.add(element201);

        Element element202 = new Element();
        element202.setOid("1.3.6.1.4.1.17484.2.9.2.1.8.2");
        element202.setName("DcSw1UpValue2");
        element202.setDataType("Integer");
        element202.setUsability(true);
        element202.setRewritable(true);
        resultList.add(element202);

        Element element203 = new Element();
        element203.setOid("1.3.6.1.4.1.17484.2.9.2.1.8.3");
        element203.setName("DcSw1UpValue3");
        element203.setDataType("Integer");
        element203.setUsability(true);
        element203.setRewritable(true);
        resultList.add(element203);

        Element element204 = new Element();
        element204.setOid("1.3.6.1.4.1.17484.2.9.2.1.8.4");
        element204.setName("DcSw1UpValue4");
        element204.setDataType("Integer");
        element204.setUsability(true);
        element204.setRewritable(true);
        resultList.add(element204);

        Element element205 = new Element();
        element205.setOid("1.3.6.1.4.1.17484.2.9.2.1.8.5");
        element205.setName("DcSw1UpValue5");
        element205.setDataType("Integer");
        element205.setUsability(true);
        element205.setRewritable(true);
        resultList.add(element205);

        Element element206 = new Element();
        element206.setOid("1.3.6.1.4.1.17484.2.9.2.1.8.6");
        element206.setName("DcSw1UpValue6");
        element206.setDataType("Integer");
        element206.setUsability(true);
        element206.setRewritable(true);
        resultList.add(element206);

        Element element207 = new Element();
        element207.setOid("1.3.6.1.4.1.17484.2.9.2.1.8.7");
        element207.setName("DcSw1UpValue7");
        element207.setDataType("Integer");
        element207.setUsability(true);
        element207.setRewritable(true);
        resultList.add(element207);

        Element element208 = new Element();
        element208.setOid("1.3.6.1.4.1.17484.2.9.2.1.8.8");
        element208.setName("DcSw1UpValue8");
        element208.setDataType("Integer");
        element208.setUsability(true);
        element208.setRewritable(true);
        resultList.add(element208);

        Element element211 = new Element();
        element211.setOid("1.3.6.1.4.1.17484.2.9.2.1.9.1");
        element211.setName("DcSw1DwnAction1");
        element211.setDataType("Integer");
        element211.setUsability(true);
        element211.setRewritable(true);
        resultList.add(element211);

        Element element212 = new Element();
        element212.setOid("1.3.6.1.4.1.17484.2.9.2.1.9.2");
        element212.setName("DcSw1DwnAction2");
        element212.setDataType("Integer");
        element212.setUsability(true);
        element212.setRewritable(true);
        resultList.add(element212);

        Element element213 = new Element();
        element213.setOid("1.3.6.1.4.1.17484.2.9.2.1.9.3");
        element213.setName("DcSw1DwnAction3");
        element213.setDataType("Integer");
        element213.setUsability(true);
        element213.setRewritable(true);
        resultList.add(element213);

        Element element214 = new Element();
        element214.setOid("1.3.6.1.4.1.17484.2.9.2.1.9.4");
        element214.setName("DcSw1DwnAction4");
        element214.setDataType("Integer");
        element214.setUsability(true);
        element214.setRewritable(true);
        resultList.add(element214);

        Element element215 = new Element();
        element215.setOid("1.3.6.1.4.1.17484.2.9.2.1.9.5");
        element215.setName("DcSw1DwnAction5");
        element215.setDataType("Integer");
        element215.setUsability(true);
        element215.setRewritable(true);
        resultList.add(element215);

        Element element216 = new Element();
        element216.setOid("1.3.6.1.4.1.17484.2.9.2.1.9.6");
        element216.setName("DcSw1DwnAction6");
        element216.setDataType("Integer");
        element216.setUsability(true);
        element216.setRewritable(true);
        resultList.add(element216);

        Element element217 = new Element();
        element217.setOid("1.3.6.1.4.1.17484.2.9.2.1.9.7");
        element217.setName("DcSw1DwnAction7");
        element217.setDataType("Integer");
        element217.setUsability(true);
        element217.setRewritable(true);
        resultList.add(element217);

        Element element218 = new Element();
        element218.setOid("1.3.6.1.4.1.17484.2.9.2.1.9.8");
        element218.setName("DcSw1DwnAction8");
        element218.setDataType("Integer");
        element218.setUsability(true);
        element218.setRewritable(true);
        resultList.add(element218);

        Element element221 = new Element();
        element221.setOid("1.3.6.1.4.1.17484.2.9.2.1.10.1");
        element221.setName("DcSw1DwnValue1");
        element221.setDataType("Integer");
        element221.setUsability(true);
        element221.setRewritable(true);
        resultList.add(element221);

        Element element222 = new Element();
        element222.setOid("1.3.6.1.4.1.17484.2.9.2.1.10.2");
        element222.setName("DcSw1DwnValue2");
        element222.setDataType("Integer");
        element222.setUsability(true);
        element222.setRewritable(true);
        resultList.add(element222);

        Element element223 = new Element();
        element223.setOid("1.3.6.1.4.1.17484.2.9.2.1.10.3");
        element223.setName("DcSw1DwnValue3");
        element223.setDataType("Integer");
        element223.setUsability(true);
        element223.setRewritable(true);
        resultList.add(element223);

        Element element224 = new Element();
        element224.setOid("1.3.6.1.4.1.17484.2.9.2.1.10.4");
        element224.setName("DcSw1DwnValue4");
        element224.setDataType("Integer");
        element224.setUsability(true);
        element224.setRewritable(true);
        resultList.add(element224);

        Element element225 = new Element();
        element225.setOid("1.3.6.1.4.1.17484.2.9.2.1.10.5");
        element225.setName("DcSw1DwnValue5");
        element225.setDataType("Integer");
        element225.setUsability(true);
        element225.setRewritable(true);
        resultList.add(element225);

        Element element226 = new Element();
        element226.setOid("1.3.6.1.4.1.17484.2.9.2.1.10.6");
        element226.setName("DcSw1DwnValue6");
        element226.setDataType("Integer");
        element226.setUsability(true);
        element226.setRewritable(true);
        resultList.add(element226);

        Element element227 = new Element();
        element227.setOid("1.3.6.1.4.1.17484.2.9.2.1.10.7");
        element227.setName("DcSw1DwnValue7");
        element227.setDataType("Integer");
        element227.setUsability(true);
        element227.setRewritable(true);
        resultList.add(element227);

        Element element228 = new Element();
        element228.setOid("1.3.6.1.4.1.17484.2.9.2.1.10.8");
        element228.setName("DcSw1DwnValue8");
        element228.setDataType("Integer");
        element228.setUsability(true);
        element228.setRewritable(true);
        resultList.add(element228);

        Element element231 = new Element();
        element231.setOid("1.3.6.1.4.1.17484.2.9.2.1.11.1");
        element231.setName("DcSw2UpAction1");
        element231.setDataType("Integer");
        element231.setUsability(true);
        element231.setRewritable(true);
        resultList.add(element231);

        Element element232 = new Element();
        element232.setOid("1.3.6.1.4.1.17484.2.9.2.1.11.2");
        element232.setName("DcSw2UpAction2");
        element232.setDataType("Integer");
        element232.setUsability(true);
        element232.setRewritable(true);
        resultList.add(element232);

        Element element233 = new Element();
        element233.setOid("1.3.6.1.4.1.17484.2.9.2.1.11.3");
        element233.setName("DcSw2UpAction3");
        element233.setDataType("Integer");
        element233.setUsability(true);
        element233.setRewritable(true);
        resultList.add(element233);

        Element element234 = new Element();
        element234.setOid("1.3.6.1.4.1.17484.2.9.2.1.11.4");
        element234.setName("DcSw2UpAction4");
        element234.setDataType("Integer");
        element234.setUsability(true);
        element234.setRewritable(true);
        resultList.add(element234);

        Element element235 = new Element();
        element235.setOid("1.3.6.1.4.1.17484.2.9.2.1.11.5");
        element235.setName("DcSw2UpAction5");
        element235.setDataType("Integer");
        element235.setUsability(true);
        element235.setRewritable(true);
        resultList.add(element235);

        Element element236 = new Element();
        element236.setOid("1.3.6.1.4.1.17484.2.9.2.1.11.6");
        element236.setName("DcSw2UpAction6");
        element236.setDataType("Integer");
        element236.setUsability(true);
        element236.setRewritable(true);
        resultList.add(element236);

        Element element237 = new Element();
        element237.setOid("1.3.6.1.4.1.17484.2.9.2.1.11.7");
        element237.setName("DcSw2UpAction7");
        element237.setDataType("Integer");
        element237.setUsability(true);
        element237.setRewritable(true);
        resultList.add(element237);

        Element element238 = new Element();
        element238.setOid("1.3.6.1.4.1.17484.2.9.2.1.11.8");
        element238.setName("DcSw2UpAction8");
        element238.setDataType("Integer");
        element238.setUsability(true);
        element238.setRewritable(true);
        resultList.add(element238);

        Element element241 = new Element();
        element241.setOid("1.3.6.1.4.1.17484.2.9.2.1.12.1");
        element241.setName("DcSw2UpValue1");
        element241.setDataType("Integer");
        element241.setUsability(true);
        element241.setRewritable(true);
        resultList.add(element241);

        Element element242 = new Element();
        element242.setOid("1.3.6.1.4.1.17484.2.9.2.1.12.2");
        element242.setName("DcSw2UpValue2");
        element242.setDataType("Integer");
        element242.setUsability(true);
        element242.setRewritable(true);
        resultList.add(element242);

        Element element243 = new Element();
        element243.setOid("1.3.6.1.4.1.17484.2.9.2.1.12.3");
        element243.setName("DcSw2UpValue3");
        element243.setDataType("Integer");
        element243.setUsability(true);
        element243.setRewritable(true);
        resultList.add(element243);

        Element element244 = new Element();
        element244.setOid("1.3.6.1.4.1.17484.2.9.2.1.12.4");
        element244.setName("DcSw2UpValue4");
        element244.setDataType("Integer");
        element244.setUsability(true);
        element244.setRewritable(true);
        resultList.add(element244);

        Element element245 = new Element();
        element245.setOid("1.3.6.1.4.1.17484.2.9.2.1.12.5");
        element245.setName("DcSw2UpValue5");
        element245.setDataType("Integer");
        element245.setUsability(true);
        element245.setRewritable(true);
        resultList.add(element245);

        Element element246 = new Element();
        element246.setOid("1.3.6.1.4.1.17484.2.9.2.1.12.6");
        element246.setName("DcSw2UpValue6");
        element246.setDataType("Integer");
        element246.setUsability(true);
        element246.setRewritable(true);
        resultList.add(element246);

        Element element247 = new Element();
        element247.setOid("1.3.6.1.4.1.17484.2.9.2.1.12.7");
        element247.setName("DcSw2UpValue7");
        element247.setDataType("Integer");
        element247.setUsability(true);
        element247.setRewritable(true);
        resultList.add(element247);

        Element element248 = new Element();
        element248.setOid("1.3.6.1.4.1.17484.2.9.2.1.12.8");
        element248.setName("DcSw2UpValue8");
        element248.setDataType("Integer");
        element248.setUsability(true);
        element248.setRewritable(true);
        resultList.add(element248);

        Element element251 = new Element();
        element251.setOid("1.3.6.1.4.1.17484.2.9.2.1.13.1");
        element251.setName("DcSw2DwnAction1");
        element251.setDataType("Integer");
        element251.setUsability(true);
        element251.setRewritable(true);
        resultList.add(element251);

        Element element252 = new Element();
        element252.setOid("1.3.6.1.4.1.17484.2.9.2.1.13.2");
        element252.setName("DcSw2DwnAction2");
        element252.setDataType("Integer");
        element252.setUsability(true);
        element252.setRewritable(true);
        resultList.add(element252);

        Element element253 = new Element();
        element253.setOid("1.3.6.1.4.1.17484.2.9.2.1.13.3");
        element253.setName("DcSw2DwnAction3");
        element253.setDataType("Integer");
        element253.setUsability(true);
        element253.setRewritable(true);
        resultList.add(element253);

        Element element254 = new Element();
        element254.setOid("1.3.6.1.4.1.17484.2.9.2.1.13.4");
        element254.setName("DcSw2DwnAction4");
        element254.setDataType("Integer");
        element254.setUsability(true);
        element254.setRewritable(true);
        resultList.add(element254);

        Element element255 = new Element();
        element255.setOid("1.3.6.1.4.1.17484.2.9.2.1.13.5");
        element255.setName("DcSw2DwnAction5");
        element255.setDataType("Integer");
        element255.setUsability(true);
        element255.setRewritable(true);
        resultList.add(element255);

        Element element256 = new Element();
        element256.setOid("1.3.6.1.4.1.17484.2.9.2.1.13.6");
        element256.setName("DcSw2DwnAction6");
        element256.setDataType("Integer");
        element256.setUsability(true);
        element256.setRewritable(true);
        resultList.add(element256);

        Element element257 = new Element();
        element257.setOid("1.3.6.1.4.1.17484.2.9.2.1.13.7");
        element257.setName("DcSw2DwnAction7");
        element257.setDataType("Integer");
        element257.setUsability(true);
        element257.setRewritable(true);
        resultList.add(element257);

        Element element258 = new Element();
        element258.setOid("1.3.6.1.4.1.17484.2.9.2.1.13.8");
        element258.setName("DcSw2DwnAction8");
        element258.setDataType("Integer");
        element258.setUsability(true);
        element258.setRewritable(true);
        resultList.add(element258);

        Element element261 = new Element();
        element261.setOid("1.3.6.1.4.1.17484.2.9.2.1.14.1");
        element261.setName("DcSw2DwnValue1");
        element261.setDataType("Integer");
        element261.setUsability(true);
        element261.setRewritable(true);
        resultList.add(element261);

        Element element262 = new Element();
        element262.setOid("1.3.6.1.4.1.17484.2.9.2.1.14.2");
        element262.setName("DcSw2DwnValue2");
        element262.setDataType("Integer");
        element262.setUsability(true);
        element262.setRewritable(true);
        resultList.add(element262);

        Element element263 = new Element();
        element263.setOid("1.3.6.1.4.1.17484.2.9.2.1.14.3");
        element263.setName("DcSw2DwnValue3");
        element263.setDataType("Integer");
        element263.setUsability(true);
        element263.setRewritable(true);
        resultList.add(element263);

        Element element264 = new Element();
        element264.setOid("1.3.6.1.4.1.17484.2.9.2.1.14.4");
        element264.setName("DcSw2DwnValue4");
        element264.setDataType("Integer");
        element264.setUsability(true);
        element264.setRewritable(true);
        resultList.add(element264);

        Element element265 = new Element();
        element265.setOid("1.3.6.1.4.1.17484.2.9.2.1.14.5");
        element265.setName("DcSw2DwnValue5");
        element265.setDataType("Integer");
        element265.setUsability(true);
        element265.setRewritable(true);
        resultList.add(element265);

        Element element266 = new Element();
        element266.setOid("1.3.6.1.4.1.17484.2.9.2.1.14.6");
        element266.setName("DcSw2DwnValue6");
        element266.setDataType("Integer");
        element266.setUsability(true);
        element266.setRewritable(true);
        resultList.add(element266);

        Element element267 = new Element();
        element267.setOid("1.3.6.1.4.1.17484.2.9.2.1.14.7");
        element267.setName("DcSw2DwnValue7");
        element267.setDataType("Integer");
        element267.setUsability(true);
        element267.setRewritable(true);
        resultList.add(element267);

        Element element268 = new Element();
        element268.setOid("1.3.6.1.4.1.17484.2.9.2.1.14.8");
        element268.setName("DcSw2DwnValue8");
        element268.setDataType("Integer");
        element268.setUsability(true);
        element268.setRewritable(true);
        resultList.add(element268);

        Element element271 = new Element();
        element271.setOid("1.3.6.1.4.1.17484.2.9.2.1.15.1");
        element271.setName("DcSw3UpAction1");
        element271.setDataType("Integer");
        element271.setUsability(true);
        element271.setRewritable(true);
        resultList.add(element271);

        Element element272 = new Element();
        element272.setOid("1.3.6.1.4.1.17484.2.9.2.1.15.2");
        element272.setName("DcSw3UpAction2");
        element272.setDataType("Integer");
        element272.setUsability(true);
        element272.setRewritable(true);
        resultList.add(element272);

        Element element273 = new Element();
        element273.setOid("1.3.6.1.4.1.17484.2.9.2.1.15.3");
        element273.setName("DcSw3UpAction3");
        element273.setDataType("Integer");
        element273.setUsability(true);
        element273.setRewritable(true);
        resultList.add(element273);

        Element element274 = new Element();
        element274.setOid("1.3.6.1.4.1.17484.2.9.2.1.15.4");
        element274.setName("DcSw3UpAction4");
        element274.setDataType("Integer");
        element274.setUsability(true);
        element274.setRewritable(true);
        resultList.add(element274);

        Element element275 = new Element();
        element275.setOid("1.3.6.1.4.1.17484.2.9.2.1.15.5");
        element275.setName("DcSw3UpAction5");
        element275.setDataType("Integer");
        element275.setUsability(true);
        element275.setRewritable(true);
        resultList.add(element275);

        Element element276 = new Element();
        element276.setOid("1.3.6.1.4.1.17484.2.9.2.1.15.6");
        element276.setName("DcSw3UpAction6");
        element276.setDataType("Integer");
        element276.setUsability(true);
        element276.setRewritable(true);
        resultList.add(element276);

        Element element277 = new Element();
        element277.setOid("1.3.6.1.4.1.17484.2.9.2.1.15.7");
        element277.setName("DcSw3UpAction7");
        element277.setDataType("Integer");
        element277.setUsability(true);
        element277.setRewritable(true);
        resultList.add(element277);

        Element element278 = new Element();
        element278.setOid("1.3.6.1.4.1.17484.2.9.2.1.15.8");
        element278.setName("DcSw3UpAction8");
        element278.setDataType("Integer");
        element278.setUsability(true);
        element278.setRewritable(true);
        resultList.add(element278);

        Element element281 = new Element();
        element281.setOid("1.3.6.1.4.1.17484.2.9.2.1.16.1");
        element281.setName("DcSw3UpValue1");
        element281.setDataType("Integer");
        element281.setUsability(true);
        element281.setRewritable(true);
        resultList.add(element281);

        Element element282 = new Element();
        element282.setOid("1.3.6.1.4.1.17484.2.9.2.1.16.2");
        element282.setName("DcSw3UpValue2");
        element282.setDataType("Integer");
        element282.setUsability(true);
        element282.setRewritable(true);
        resultList.add(element282);

        Element element283 = new Element();
        element283.setOid("1.3.6.1.4.1.17484.2.9.2.1.16.3");
        element283.setName("DcSw3UpValue3");
        element283.setDataType("Integer");
        element283.setUsability(true);
        element283.setRewritable(true);
        resultList.add(element283);

        Element element284 = new Element();
        element284.setOid("1.3.6.1.4.1.17484.2.9.2.1.16.4");
        element284.setName("DcSw3UpValue4");
        element284.setDataType("Integer");
        element284.setUsability(true);
        element284.setRewritable(true);
        resultList.add(element284);

        Element element285 = new Element();
        element285.setOid("1.3.6.1.4.1.17484.2.9.2.1.16.5");
        element285.setName("DcSw3UpValue5");
        element285.setDataType("Integer");
        element285.setUsability(true);
        element285.setRewritable(true);
        resultList.add(element285);

        Element element286 = new Element();
        element286.setOid("1.3.6.1.4.1.17484.2.9.2.1.16.6");
        element286.setName("DcSw3UpValue6");
        element286.setDataType("Integer");
        element286.setUsability(true);
        element286.setRewritable(true);
        resultList.add(element286);

        Element element287 = new Element();
        element287.setOid("1.3.6.1.4.1.17484.2.9.2.1.16.7");
        element287.setName("DcSw3UpValue7");
        element287.setDataType("Integer");
        element287.setUsability(true);
        element287.setRewritable(true);
        resultList.add(element287);

        Element element288 = new Element();
        element288.setOid("1.3.6.1.4.1.17484.2.9.2.1.16.8");
        element288.setName("DcSw3UpValue8");
        element288.setDataType("Integer");
        element288.setUsability(true);
        element288.setRewritable(true);
        resultList.add(element288);

        Element element291 = new Element();
        element291.setOid("1.3.6.1.4.1.17484.2.9.2.1.17.1");
        element291.setName("DcSw3DwnAction1");
        element291.setDataType("Integer");
        element291.setUsability(true);
        element291.setRewritable(true);
        resultList.add(element291);

        Element element292 = new Element();
        element292.setOid("1.3.6.1.4.1.17484.2.9.2.1.17.2");
        element292.setName("DcSw3DwnAction2");
        element292.setDataType("Integer");
        element292.setUsability(true);
        element292.setRewritable(true);
        resultList.add(element292);

        Element element293 = new Element();
        element293.setOid("1.3.6.1.4.1.17484.2.9.2.1.17.3");
        element293.setName("DcSw3DwnAction3");
        element293.setDataType("Integer");
        element293.setUsability(true);
        element293.setRewritable(true);
        resultList.add(element293);

        Element element294 = new Element();
        element294.setOid("1.3.6.1.4.1.17484.2.9.2.1.17.4");
        element294.setName("DcSw3DwnAction4");
        element294.setDataType("Integer");
        element294.setUsability(true);
        element294.setRewritable(true);
        resultList.add(element294);

        Element element295 = new Element();
        element295.setOid("1.3.6.1.4.1.17484.2.9.2.1.17.5");
        element295.setName("DcSw3DwnAction5");
        element295.setDataType("Integer");
        element295.setUsability(true);
        element295.setRewritable(true);
        resultList.add(element295);

        Element element296 = new Element();
        element296.setOid("1.3.6.1.4.1.17484.2.9.2.1.17.6");
        element296.setName("DcSw3DwnAction6");
        element296.setDataType("Integer");
        element296.setUsability(true);
        element296.setRewritable(true);
        resultList.add(element296);

        Element element297 = new Element();
        element297.setOid("1.3.6.1.4.1.17484.2.9.2.1.17.7");
        element297.setName("DcSw3DwnAction7");
        element297.setDataType("Integer");
        element297.setUsability(true);
        element297.setRewritable(true);
        resultList.add(element297);

        Element element298 = new Element();
        element298.setOid("1.3.6.1.4.1.17484.2.9.2.1.17.8");
        element298.setName("DcSw3DwnAction8");
        element298.setDataType("Integer");
        element298.setUsability(true);
        element298.setRewritable(true);
        resultList.add(element298);

        Element element301 = new Element();
        element301.setOid("1.3.6.1.4.1.17484.2.9.2.1.18.1");
        element301.setName("DcSw3DwnValue1");
        element301.setDataType("Integer");
        element301.setUsability(true);
        element301.setRewritable(true);
        resultList.add(element301);

        Element element302 = new Element();
        element302.setOid("1.3.6.1.4.1.17484.2.9.2.1.18.2");
        element302.setName("DcSw3DwnValue2");
        element302.setDataType("Integer");
        element302.setUsability(true);
        element302.setRewritable(true);
        resultList.add(element302);

        Element element303 = new Element();
        element303.setOid("1.3.6.1.4.1.17484.2.9.2.1.18.3");
        element303.setName("DcSw3DwnValue3");
        element303.setDataType("Integer");
        element303.setUsability(true);
        element303.setRewritable(true);
        resultList.add(element303);

        Element element304 = new Element();
        element304.setOid("1.3.6.1.4.1.17484.2.9.2.1.18.4");
        element304.setName("DcSw3DwnValue4");
        element304.setDataType("Integer");
        element304.setUsability(true);
        element304.setRewritable(true);
        resultList.add(element304);

        Element element305 = new Element();
        element305.setOid("1.3.6.1.4.1.17484.2.9.2.1.18.5");
        element305.setName("DcSw3DwnValue5");
        element305.setDataType("Integer");
        element305.setUsability(true);
        element305.setRewritable(true);
        resultList.add(element305);

        Element element306 = new Element();
        element306.setOid("1.3.6.1.4.1.17484.2.9.2.1.18.6");
        element306.setName("DcSw3DwnValue6");
        element306.setDataType("Integer");
        element306.setUsability(true);
        element306.setRewritable(true);
        resultList.add(element306);

        Element element307 = new Element();
        element307.setOid("1.3.6.1.4.1.17484.2.9.2.1.18.7");
        element307.setName("DcSw3DwnValue7");
        element307.setDataType("Integer");
        element307.setUsability(true);
        element307.setRewritable(true);
        resultList.add(element307);

        Element element308 = new Element();
        element308.setOid("1.3.6.1.4.1.17484.2.9.2.1.18.8");
        element308.setName("DcSw3DwnValue8");
        element308.setDataType("Integer");
        element308.setUsability(true);
        element308.setRewritable(true);
        resultList.add(element308);

        Element element311 = new Element();
        element311.setOid("1.3.6.1.4.1.17484.2.9.2.1.19.1");
        element311.setName("AcSwUpAction1");
        element311.setDataType("Integer");
        element311.setUsability(true);
        element311.setRewritable(true);
        resultList.add(element311);

        Element element312 = new Element();
        element312.setOid("1.3.6.1.4.1.17484.2.9.2.1.19.2");
        element312.setName("AcSwUpAction2");
        element312.setDataType("Integer");
        element312.setUsability(true);
        element312.setRewritable(true);
        resultList.add(element312);

        Element element313 = new Element();
        element313.setOid("1.3.6.1.4.1.17484.2.9.2.1.19.3");
        element313.setName("AcSwUpAction3");
        element313.setDataType("Integer");
        element313.setUsability(true);
        element313.setRewritable(true);
        resultList.add(element313);

        Element element314 = new Element();
        element314.setOid("1.3.6.1.4.1.17484.2.9.2.1.19.4");
        element314.setName("AcSwUpAction4");
        element314.setDataType("Integer");
        element314.setUsability(true);
        element314.setRewritable(true);
        resultList.add(element314);

        Element element315 = new Element();
        element315.setOid("1.3.6.1.4.1.17484.2.9.2.1.19.5");
        element315.setName("AcSwUpAction5");
        element315.setDataType("Integer");
        element315.setUsability(true);
        element315.setRewritable(true);
        resultList.add(element315);

        Element element316 = new Element();
        element316.setOid("1.3.6.1.4.1.17484.2.9.2.1.19.6");
        element316.setName("AcSwUpAction6");
        element316.setDataType("Integer");
        element316.setUsability(true);
        element316.setRewritable(true);
        resultList.add(element316);

        Element element317 = new Element();
        element317.setOid("1.3.6.1.4.1.17484.2.9.2.1.19.7");
        element317.setName("AcSwUpAction7");
        element317.setDataType("Integer");
        element317.setUsability(true);
        element317.setRewritable(true);
        resultList.add(element317);

        Element element318 = new Element();
        element318.setOid("1.3.6.1.4.1.17484.2.9.2.1.19.8");
        element318.setName("AcSwUpAction8");
        element318.setDataType("Integer");
        element318.setUsability(true);
        element318.setRewritable(true);
        resultList.add(element318);

        Element element321 = new Element();
        element321.setOid("1.3.6.1.4.1.17484.2.9.2.1.20.1");
        element321.setName("AcSwUpValue1");
        element321.setDataType("Integer");
        element321.setUsability(true);
        element321.setRewritable(true);
        resultList.add(element321);

        Element element322 = new Element();
        element322.setOid("1.3.6.1.4.1.17484.2.9.2.1.20.2");
        element322.setName("AcSwUpValue2");
        element322.setDataType("Integer");
        element322.setUsability(true);
        element322.setRewritable(true);
        resultList.add(element322);

        Element element323 = new Element();
        element323.setOid("1.3.6.1.4.1.17484.2.9.2.1.20.3");
        element323.setName("AcSwUpValue3");
        element323.setDataType("Integer");
        element323.setUsability(true);
        element323.setRewritable(true);
        resultList.add(element323);

        Element element324 = new Element();
        element324.setOid("1.3.6.1.4.1.17484.2.9.2.1.20.4");
        element324.setName("AcSwUpValue4");
        element324.setDataType("Integer");
        element324.setUsability(true);
        element324.setRewritable(true);
        resultList.add(element324);

        Element element325 = new Element();
        element325.setOid("1.3.6.1.4.1.17484.2.9.2.1.20.5");
        element325.setName("AcSwUpValue5");
        element325.setDataType("Integer");
        element325.setUsability(true);
        element325.setRewritable(true);
        resultList.add(element325);

        Element element326 = new Element();
        element326.setOid("1.3.6.1.4.1.17484.2.9.2.1.20.6");
        element326.setName("AcSwUpValue6");
        element326.setDataType("Integer");
        element326.setUsability(true);
        element326.setRewritable(true);
        resultList.add(element326);

        Element element327 = new Element();
        element327.setOid("1.3.6.1.4.1.17484.2.9.2.1.20.7");
        element327.setName("AcSwUpValue7");
        element327.setDataType("Integer");
        element327.setUsability(true);
        element327.setRewritable(true);
        resultList.add(element327);

        Element element328 = new Element();
        element328.setOid("1.3.6.1.4.1.17484.2.9.2.1.20.8");
        element328.setName("AcSwUpValue8");
        element328.setDataType("Integer");
        element328.setUsability(true);
        element328.setRewritable(true);
        resultList.add(element328);

        Element element331 = new Element();
        element331.setOid("1.3.6.1.4.1.17484.2.9.2.1.21.1");
        element331.setName("AcSwDwnAction1");
        element331.setDataType("Integer");
        element331.setUsability(true);
        element331.setRewritable(true);
        resultList.add(element331);

        Element element332 = new Element();
        element332.setOid("1.3.6.1.4.1.17484.2.9.2.1.21.2");
        element332.setName("AcSwDwnAction2");
        element332.setDataType("Integer");
        element332.setUsability(true);
        element332.setRewritable(true);
        resultList.add(element332);

        Element element333 = new Element();
        element333.setOid("1.3.6.1.4.1.17484.2.9.2.1.21.3");
        element333.setName("AcSwDwnAction3");
        element333.setDataType("Integer");
        element333.setUsability(true);
        element333.setRewritable(true);
        resultList.add(element333);

        Element element334 = new Element();
        element334.setOid("1.3.6.1.4.1.17484.2.9.2.1.21.4");
        element334.setName("AcSwDwnAction4");
        element334.setDataType("Integer");
        element334.setUsability(true);
        element334.setRewritable(true);
        resultList.add(element334);

        Element element335 = new Element();
        element335.setOid("1.3.6.1.4.1.17484.2.9.2.1.21.5");
        element335.setName("AcSwDwnAction5");
        element335.setDataType("Integer");
        element335.setUsability(true);
        element335.setRewritable(true);
        resultList.add(element335);

        Element element336 = new Element();
        element336.setOid("1.3.6.1.4.1.17484.2.9.2.1.21.6");
        element336.setName("AcSwDwnAction6");
        element336.setDataType("Integer");
        element336.setUsability(true);
        element336.setRewritable(true);
        resultList.add(element336);

        Element element337 = new Element();
        element337.setOid("1.3.6.1.4.1.17484.2.9.2.1.21.7");
        element337.setName("AcSwDwnAction7");
        element337.setDataType("Integer");
        element337.setUsability(true);
        element337.setRewritable(true);
        resultList.add(element337);

        Element element338 = new Element();
        element338.setOid("1.3.6.1.4.1.17484.2.9.2.1.21.8");
        element338.setName("AcSwDwnAction8");
        element338.setDataType("Integer");
        element338.setUsability(true);
        element338.setRewritable(true);
        resultList.add(element338);

        Element element341 = new Element();
        element341.setOid("1.3.6.1.4.1.17484.2.9.2.1.22.1");
        element341.setName("AcSwDwnValue1");
        element341.setDataType("Integer");
        element341.setUsability(true);
        element341.setRewritable(true);
        resultList.add(element341);

        Element element342 = new Element();
        element342.setOid("1.3.6.1.4.1.17484.2.9.2.1.22.2");
        element342.setName("AcSwDwnValue2");
        element342.setDataType("Integer");
        element342.setUsability(true);
        element342.setRewritable(true);
        resultList.add(element342);

        Element element343 = new Element();
        element343.setOid("1.3.6.1.4.1.17484.2.9.2.1.22.3");
        element343.setName("AcSwDwnValue3");
        element343.setDataType("Integer");
        element343.setUsability(true);
        element343.setRewritable(true);
        resultList.add(element343);

        Element element344 = new Element();
        element344.setOid("1.3.6.1.4.1.17484.2.9.2.1.22.4");
        element344.setName("AcSwDwnValue4");
        element344.setDataType("Integer");
        element344.setUsability(true);
        element344.setRewritable(true);
        resultList.add(element344);

        Element element345 = new Element();
        element345.setOid("1.3.6.1.4.1.17484.2.9.2.1.22.5");
        element345.setName("AcSwDwnValue5");
        element345.setDataType("Integer");
        element345.setUsability(true);
        element345.setRewritable(true);
        resultList.add(element345);

        Element element346 = new Element();
        element346.setOid("1.3.6.1.4.1.17484.2.9.2.1.22.6");
        element346.setName("AcSwDwnValue6");
        element346.setDataType("Integer");
        element346.setUsability(true);
        element346.setRewritable(true);
        resultList.add(element346);

        Element element347 = new Element();
        element347.setOid("1.3.6.1.4.1.17484.2.9.2.1.22.7");
        element347.setName("AcSwDwnValue7");
        element347.setDataType("Integer");
        element347.setUsability(true);
        element347.setRewritable(true);
        resultList.add(element347);

        Element element348 = new Element();
        element348.setOid("1.3.6.1.4.1.17484.2.9.2.1.22.8");
        element348.setName("AcSwDwnValue8");
        element348.setDataType("Integer");
        element348.setUsability(true);
        element348.setRewritable(true);
        resultList.add(element348);

        Element element351 = new Element();
        element351.setOid("1.3.6.1.4.1.17484.2.9.2.1.23.1");
        element351.setName("TupTrapFlag1");
        element351.setDataType("Integer");
        element351.setUsability(true);
        element351.setRewritable(true);
        resultList.add(element351);

        Element element352 = new Element();
        element352.setOid("1.3.6.1.4.1.17484.2.9.2.1.23.2");
        element352.setName("TupTrapFlag2");
        element352.setDataType("Integer");
        element352.setUsability(true);
        element352.setRewritable(true);
        resultList.add(element352);

        Element element353 = new Element();
        element353.setOid("1.3.6.1.4.1.17484.2.9.2.1.23.3");
        element353.setName("TupTrapFlag3");
        element353.setDataType("Integer");
        element353.setUsability(true);
        element353.setRewritable(true);
        resultList.add(element353);

        Element element354 = new Element();
        element354.setOid("1.3.6.1.4.1.17484.2.9.2.1.23.4");
        element354.setName("TupTrapFlag4");
        element354.setDataType("Integer");
        element354.setUsability(true);
        element354.setRewritable(true);
        resultList.add(element354);

        Element element355 = new Element();
        element355.setOid("1.3.6.1.4.1.17484.2.9.2.1.23.5");
        element355.setName("TupTrapFlag5");
        element355.setDataType("Integer");
        element355.setUsability(true);
        element355.setRewritable(true);
        resultList.add(element355);

        Element element356 = new Element();
        element356.setOid("1.3.6.1.4.1.17484.2.9.2.1.23.6");
        element356.setName("TupTrapFlag6");
        element356.setDataType("Integer");
        element356.setUsability(true);
        element356.setRewritable(true);
        resultList.add(element356);

        Element element357 = new Element();
        element357.setOid("1.3.6.1.4.1.17484.2.9.2.1.23.7");
        element357.setName("TupTrapFlag7");
        element357.setDataType("Integer");
        element357.setUsability(true);
        element357.setRewritable(true);
        resultList.add(element357);

        Element element358 = new Element();
        element358.setOid("1.3.6.1.4.1.17484.2.9.2.1.23.8");
        element358.setName("TupTrapFlag8");
        element358.setDataType("Integer");
        element358.setUsability(true);
        element358.setRewritable(true);
        resultList.add(element358);

        Element element361 = new Element();
        element361.setOid("1.3.6.1.4.1.17484.2.9.2.1.24.1");
        element361.setName("TdwnTrapFlag1");
        element361.setDataType("Integer");
        element361.setUsability(true);
        element361.setRewritable(true);
        resultList.add(element361);

        Element element362 = new Element();
        element362.setOid("1.3.6.1.4.1.17484.2.9.2.1.24.2");
        element362.setName("TdwnTrapFlag2");
        element362.setDataType("Integer");
        element362.setUsability(true);
        element362.setRewritable(true);
        resultList.add(element362);

        Element element363 = new Element();
        element363.setOid("1.3.6.1.4.1.17484.2.9.2.1.24.3");
        element363.setName("TdwnTrapFlag3");
        element363.setDataType("Integer");
        element363.setUsability(true);
        element363.setRewritable(true);
        resultList.add(element363);

        Element element364 = new Element();
        element364.setOid("1.3.6.1.4.1.17484.2.9.2.1.24.4");
        element364.setName("TdwnTrapFlag4");
        element364.setDataType("Integer");
        element364.setUsability(true);
        element364.setRewritable(true);
        resultList.add(element364);

        Element element365 = new Element();
        element365.setOid("1.3.6.1.4.1.17484.2.9.2.1.24.5");
        element365.setName("TdwnTrapFlag5");
        element365.setDataType("Integer");
        element365.setUsability(true);
        element365.setRewritable(true);
        resultList.add(element365);

        Element element366 = new Element();
        element366.setOid("1.3.6.1.4.1.17484.2.9.2.1.24.6");
        element366.setName("TdwnTrapFlag6");
        element366.setDataType("Integer");
        element366.setUsability(true);
        element366.setRewritable(true);
        resultList.add(element366);

        Element element367 = new Element();
        element367.setOid("1.3.6.1.4.1.17484.2.9.2.1.24.7");
        element367.setName("TdwnTrapFlag7");
        element367.setDataType("Integer");
        element367.setUsability(true);
        element367.setRewritable(true);
        resultList.add(element367);

        Element element368 = new Element();
        element368.setOid("1.3.6.1.4.1.17484.2.9.2.1.24.8");
        element368.setName("TdwnTrapFlag8");
        element368.setDataType("Integer");
        element368.setUsability(true);
        element368.setRewritable(true);
        resultList.add(element368);

        Element element371 = new Element();
        element371.setOid("1.3.6.1.4.1.17484.2.7.2.1.1.1");
        element371.setName("Ping IP address1");
        element371.setDataType("Integer");
        element371.setUsability(true);
        element371.setRewritable(true);
        resultList.add(element371);

        Element element372 = new Element();
        element372.setOid("1.3.6.1.4.1.17484.2.7.2.1.1.2");
        element372.setName("Ping IP address2");
        element372.setDataType("Integer");
        element372.setUsability(true);
        element372.setRewritable(true);
        resultList.add(element372);

        Element element373 = new Element();
        element373.setOid("1.3.6.1.4.1.17484.2.7.2.1.1.3");
        element373.setName("Ping IP address3");
        element373.setDataType("Integer");
        element373.setUsability(true);
        element373.setRewritable(true);
        resultList.add(element373);

        Element element374 = new Element();
        element374.setOid("1.3.6.1.4.1.17484.2.7.2.1.1.4");
        element374.setName("Ping IP address4");
        element374.setDataType("Integer");
        element374.setUsability(true);
        element374.setRewritable(true);
        resultList.add(element374);

        Element element381 = new Element();
        element381.setOid("1.3.6.1.4.1.17484.2.7.2.1.2.1");
        element381.setName("Ping Period Value1");
        element381.setDataType("Integer");
        element381.setUsability(true);
        element381.setRewritable(true);
        resultList.add(element381);

        Element element382 = new Element();
        element382.setOid("1.3.6.1.4.1.17484.2.7.2.1.2.2");
        element382.setName("Ping Period Value2");
        element382.setDataType("Integer");
        element382.setUsability(true);
        element382.setRewritable(true);
        resultList.add(element382);

        Element element383 = new Element();
        element383.setOid("1.3.6.1.4.1.17484.2.7.2.1.2.3");
        element383.setName("Ping Period Value3");
        element383.setDataType("Integer");
        element383.setUsability(true);
        element383.setRewritable(true);
        resultList.add(element383);

        Element element384 = new Element();
        element384.setOid("1.3.6.1.4.1.17484.2.7.2.1.2.4");
        element384.setName("Ping Period Value4");
        element384.setDataType("Integer");
        element384.setUsability(true);
        element384.setRewritable(true);
        resultList.add(element384);

        Element element391 = new Element();
        element391.setOid("1.3.6.1.4.1.17484.2.7.2.1.3.1");
        element391.setName("Ping TimeOut Value1");
        element391.setDataType("Integer");
        element391.setUsability(true);
        element391.setRewritable(true);
        resultList.add(element391);

        Element element392 = new Element();
        element392.setOid("1.3.6.1.4.1.17484.2.7.2.1.3.2");
        element392.setName("Ping TimeOut Value2");
        element392.setDataType("Integer");
        element392.setUsability(true);
        element392.setRewritable(true);
        resultList.add(element392);

        Element element393 = new Element();
        element393.setOid("1.3.6.1.4.1.17484.2.7.2.1.3.3");
        element393.setName("Ping TimeOut Value3");
        element393.setDataType("Integer");
        element393.setUsability(true);
        element393.setRewritable(true);
        resultList.add(element393);

        Element element394 = new Element();
        element394.setOid("1.3.6.1.4.1.17484.2.7.2.1.3.4");
        element394.setName("Ping TimeOut Value4");
        element394.setDataType("Integer");
        element394.setUsability(true);
        element394.setRewritable(true);
        resultList.add(element394);

        Element element401 = new Element();
        element401.setOid("1.3.6.1.4.1.17484.2.7.2.1.4.1");
        element401.setName("Ping DcSw0 Action1");
        element401.setDataType("Integer");
        element401.setUsability(true);
        element401.setRewritable(true);
        resultList.add(element401);

        Element element402 = new Element();
        element402.setOid("1.3.6.1.4.1.17484.2.7.2.1.4.2");
        element402.setName("Ping DcSw0 Action2");
        element402.setDataType("Integer");
        element402.setUsability(true);
        element402.setRewritable(true);
        resultList.add(element402);

        Element element403 = new Element();
        element403.setOid("1.3.6.1.4.1.17484.2.7.2.1.4.3");
        element403.setName("Ping DcSw0 Action3");
        element403.setDataType("Integer");
        element403.setUsability(true);
        element403.setRewritable(true);
        resultList.add(element403);

        Element element404 = new Element();
        element404.setOid("1.3.6.1.4.1.17484.2.7.2.1.4.4");
        element404.setName("Ping DcSw0 Action4");
        element404.setDataType("Integer");
        element404.setUsability(true);
        element404.setRewritable(true);
        resultList.add(element404);

        Element element411 = new Element();
        element411.setOid("1.3.6.1.4.1.17484.2.7.2.1.5.1");
        element411.setName("Ping DcSw0 Value1");
        element411.setDataType("Integer");
        element411.setUsability(true);
        element411.setRewritable(true);
        resultList.add(element411);

        Element element412 = new Element();
        element412.setOid("1.3.6.1.4.1.17484.2.7.2.1.5.2");
        element412.setName("Ping DcSw0 Value2");
        element412.setDataType("Integer");
        element412.setUsability(true);
        element412.setRewritable(true);
        resultList.add(element412);

        Element element413 = new Element();
        element413.setOid("1.3.6.1.4.1.17484.2.7.2.1.5.3");
        element413.setName("Ping DcSw0 Value3");
        element413.setDataType("Integer");
        element413.setUsability(true);
        element413.setRewritable(true);
        resultList.add(element413);

        Element element414 = new Element();
        element414.setOid("1.3.6.1.4.1.17484.2.7.2.1.5.4");
        element414.setName("Ping DcSw0 Value4");
        element414.setDataType("Integer");
        element414.setUsability(true);
        element414.setRewritable(true);
        resultList.add(element414);

        Element element421 = new Element();
        element421.setOid("1.3.6.1.4.1.17484.2.7.2.1.6.1");
        element421.setName("Ping DcSw1 Action1");
        element421.setDataType("Integer");
        element421.setUsability(true);
        element421.setRewritable(true);
        resultList.add(element421);

        Element element422 = new Element();
        element422.setOid("1.3.6.1.4.1.17484.2.7.2.1.6.2");
        element422.setName("Ping DcSw1 Action2");
        element422.setDataType("Integer");
        element422.setUsability(true);
        element422.setRewritable(true);
        resultList.add(element422);

        Element element423 = new Element();
        element423.setOid("1.3.6.1.4.1.17484.2.7.2.1.6.3");
        element423.setName("Ping DcSw1 Action3");
        element423.setDataType("Integer");
        element423.setUsability(true);
        element423.setRewritable(true);
        resultList.add(element423);

        Element element424 = new Element();
        element424.setOid("1.3.6.1.4.1.17484.2.7.2.1.6.4");
        element424.setName("Ping DcSw1 Action4");
        element424.setDataType("Integer");
        element424.setUsability(true);
        element424.setRewritable(true);
        resultList.add(element424);

        Element element431 = new Element();
        element431.setOid("1.3.6.1.4.1.17484.2.7.2.1.7.1");
        element431.setName("Ping DcSw1 Value1");
        element431.setDataType("Integer");
        element431.setUsability(true);
        element431.setRewritable(true);
        resultList.add(element431);

        Element element432 = new Element();
        element432.setOid("1.3.6.1.4.1.17484.2.7.2.1.7.2");
        element432.setName("Ping DcSw1 Value2");
        element432.setDataType("Integer");
        element432.setUsability(true);
        element432.setRewritable(true);
        resultList.add(element432);

        Element element433 = new Element();
        element433.setOid("1.3.6.1.4.1.17484.2.7.2.1.7.3");
        element433.setName("Ping DcSw1 Value3");
        element433.setDataType("Integer");
        element433.setUsability(true);
        element433.setRewritable(true);
        resultList.add(element433);

        Element element434 = new Element();
        element434.setOid("1.3.6.1.4.1.17484.2.7.2.1.7.4");
        element434.setName("Ping DcSw1 Value4");
        element434.setDataType("Integer");
        element434.setUsability(true);
        element434.setRewritable(true);
        resultList.add(element434);

        Element element441 = new Element();
        element441.setOid("1.3.6.1.4.1.17484.2.7.2.1.8.1");
        element441.setName("Ping DcSw2 Action1");
        element441.setDataType("Integer");
        element441.setUsability(true);
        element441.setRewritable(true);
        resultList.add(element441);

        Element element442 = new Element();
        element442.setOid("1.3.6.1.4.1.17484.2.7.2.1.8.2");
        element442.setName("Ping DcSw2 Action2");
        element442.setDataType("Integer");
        element442.setUsability(true);
        element442.setRewritable(true);
        resultList.add(element442);

        Element element443 = new Element();
        element443.setOid("1.3.6.1.4.1.17484.2.7.2.1.8.3");
        element443.setName("Ping DcSw2 Action3");
        element443.setDataType("Integer");
        element443.setUsability(true);
        element443.setRewritable(true);
        resultList.add(element443);

        Element element444 = new Element();
        element444.setOid("1.3.6.1.4.1.17484.2.7.2.1.8.4");
        element444.setName("Ping DcSw2 Action4");
        element444.setDataType("Integer");
        element444.setUsability(true);
        element444.setRewritable(true);
        resultList.add(element444);

        Element element451 = new Element();
        element451.setOid("1.3.6.1.4.1.17484.2.7.2.1.9.1");
        element451.setName("Ping DcSw2 Value1");
        element451.setDataType("Integer");
        element451.setUsability(true);
        element451.setRewritable(true);
        resultList.add(element451);

        Element element452 = new Element();
        element452.setOid("1.3.6.1.4.1.17484.2.7.2.1.9.2");
        element452.setName("Ping DcSw2 Value2");
        element452.setDataType("Integer");
        element452.setUsability(true);
        element452.setRewritable(true);
        resultList.add(element452);

        Element element453 = new Element();
        element453.setOid("1.3.6.1.4.1.17484.2.7.2.1.9.3");
        element453.setName("Ping DcSw2 Value3");
        element453.setDataType("Integer");
        element453.setUsability(true);
        element453.setRewritable(true);
        resultList.add(element453);

        Element element454 = new Element();
        element454.setOid("1.3.6.1.4.1.17484.2.7.2.1.9.4");
        element454.setName("Ping DcSw2 Value4");
        element454.setDataType("Integer");
        element454.setUsability(true);
        element454.setRewritable(true);
        resultList.add(element454);

        Element element461 = new Element();
        element461.setOid("1.3.6.1.4.1.17484.2.7.2.1.10.1");
        element461.setName("Ping DcSw3 Action1");
        element461.setDataType("Integer");
        element461.setUsability(true);
        element461.setRewritable(true);
        resultList.add(element461);

        Element element462 = new Element();
        element462.setOid("1.3.6.1.4.1.17484.2.7.2.1.10.2");
        element462.setName("Ping DcSw3 Action2");
        element462.setDataType("Integer");
        element462.setUsability(true);
        element462.setRewritable(true);
        resultList.add(element462);

        Element element463 = new Element();
        element463.setOid("1.3.6.1.4.1.17484.2.7.2.1.10.3");
        element463.setName("Ping DcSw3 Action3");
        element463.setDataType("Integer");
        element463.setUsability(true);
        element463.setRewritable(true);
        resultList.add(element463);

        Element element464 = new Element();
        element464.setOid("1.3.6.1.4.1.17484.2.7.2.1.10.4");
        element464.setName("Ping DcSw3 Action4");
        element464.setDataType("Integer");
        element464.setUsability(true);
        element464.setRewritable(true);
        resultList.add(element464);

        Element element471 = new Element();
        element471.setOid("1.3.6.1.4.1.17484.2.7.2.1.11.1");
        element471.setName("Ping DcSw3 Value1");
        element471.setDataType("Integer");
        element471.setUsability(true);
        element471.setRewritable(true);
        resultList.add(element471);

        Element element472 = new Element();
        element472.setOid("1.3.6.1.4.1.17484.2.7.2.1.11.2");
        element472.setName("Ping DcSw3 Value2");
        element472.setDataType("Integer");
        element472.setUsability(true);
        element472.setRewritable(true);
        resultList.add(element472);

        Element element473 = new Element();
        element473.setOid("1.3.6.1.4.1.17484.2.7.2.1.11.3");
        element473.setName("Ping DcSw3 Value3");
        element473.setDataType("Integer");
        element473.setUsability(true);
        element473.setRewritable(true);
        resultList.add(element473);

        Element element474 = new Element();
        element474.setOid("1.3.6.1.4.1.17484.2.7.2.1.11.4");
        element474.setName("Ping DcSw3 Value4");
        element474.setDataType("Integer");
        element474.setUsability(true);
        element474.setRewritable(true);
        resultList.add(element474);

        Element element481 = new Element();
        element481.setOid("1.3.6.1.4.1.17484.2.7.2.1.12.1");
        element481.setName("Ping AcSw Action1");
        element481.setDataType("Integer");
        element481.setUsability(true);
        element481.setRewritable(true);
        resultList.add(element481);

        Element element482 = new Element();
        element482.setOid("1.3.6.1.4.1.17484.2.7.2.1.12.2");
        element482.setName("Ping AcSw Action2");
        element482.setDataType("Integer");
        element482.setUsability(true);
        element482.setRewritable(true);
        resultList.add(element482);

        Element element483 = new Element();
        element483.setOid("1.3.6.1.4.1.17484.2.7.2.1.12.3");
        element483.setName("Ping AcSw Action3");
        element483.setDataType("Integer");
        element483.setUsability(true);
        element483.setRewritable(true);
        resultList.add(element483);

        Element element484 = new Element();
        element484.setOid("1.3.6.1.4.1.17484.2.7.2.1.12.4");
        element484.setName("Ping AcSw Action4");
        element484.setDataType("Integer");
        element484.setUsability(true);
        element484.setRewritable(true);
        resultList.add(element484);

        Element element491 = new Element();
        element491.setOid("1.3.6.1.4.1.17484.2.7.2.1.13.1");
        element491.setName("Ping AcSw Value1");
        element491.setDataType("Integer");
        element491.setUsability(true);
        element491.setRewritable(true);
        resultList.add(element491);

        Element element492 = new Element();
        element492.setOid("1.3.6.1.4.1.17484.2.7.2.1.13.2");
        element492.setName("Ping AcSw Value2");
        element492.setDataType("Integer");
        element492.setUsability(true);
        element492.setRewritable(true);
        resultList.add(element492);

        Element element493 = new Element();
        element493.setOid("1.3.6.1.4.1.17484.2.7.2.1.13.3");
        element493.setName("Ping AcSw Value3");
        element493.setDataType("Integer");
        element493.setUsability(true);
        element493.setRewritable(true);
        resultList.add(element493);

        Element element494 = new Element();
        element494.setOid("1.3.6.1.4.1.17484.2.7.2.1.13.4");
        element494.setName("Ping AcSw Value4");
        element494.setDataType("Integer");
        element494.setUsability(true);
        element494.setRewritable(true);
        resultList.add(element494);

        Element element501 = new Element();
        element501.setOid("1.3.6.1.4.1.17484.2.7.2.1.14.1");
        element501.setName("PingTrapFlag1");
        element501.setDataType("Integer");
        element501.setUsability(true);
        element501.setRewritable(true);
        resultList.add(element501);

        Element element502 = new Element();
        element502.setOid("1.3.6.1.4.1.17484.2.7.2.1.14.2");
        element502.setName("PingTrapFlag2");
        element502.setDataType("Integer");
        element502.setUsability(true);
        element502.setRewritable(true);
        resultList.add(element502);

        Element element503 = new Element();
        element503.setOid("1.3.6.1.4.1.17484.2.7.2.1.14.3");
        element503.setName("PingTrapFlag3");
        element503.setDataType("Integer");
        element503.setUsability(true);
        element503.setRewritable(true);
        resultList.add(element503);

        Element element504 = new Element();
        element504.setOid("1.3.6.1.4.1.17484.2.7.2.1.14.4");
        element504.setName("PingTrapFlag4");
        element504.setDataType("Integer");
        element504.setUsability(true);
        element504.setRewritable(true);
        resultList.add(element504);

        Element element511 = new Element();
        element511.setOid("1.3.6.1.4.1.17484.2.7.2.1.15.1");
        element511.setName("Ping TimeOut Variable1");
        element511.setDataType("Integer");
        element511.setUsability(true);
        element511.setRewritable(true);
        resultList.add(element511);

        Element element512 = new Element();
        element512.setOid("1.3.6.1.4.1.17484.2.7.2.1.15.2");
        element512.setName("Ping TimeOut Variable2");
        element512.setDataType("Integer");
        element512.setUsability(true);
        element512.setRewritable(true);
        resultList.add(element512);

        Element element513 = new Element();
        element513.setOid("1.3.6.1.4.1.17484.2.7.2.1.15.3");
        element513.setName("Ping TimeOut Variable3");
        element513.setDataType("Integer");
        element513.setUsability(true);
        element513.setRewritable(true);
        resultList.add(element513);

        Element element514 = new Element();
        element514.setOid("1.3.6.1.4.1.17484.2.7.2.1.15.4");
        element514.setName("Ping TimeOut Variable4");
        element514.setDataType("Integer");
        element514.setUsability(true);
        element514.setRewritable(true);
        resultList.add(element514);

        Element element521 = new Element();
        element521.setOid("1.3.6.1.4.1.17484.2.8.2.1.1.1");
        element521.setName("ADC Value1");
        element521.setDataType("Integer");
        element521.setUsability(true);
        element521.setRewritable(false);
        resultList.add(element521);

        Element element522 = new Element();
        element522.setOid("1.3.6.1.4.1.17484.2.8.2.1.1.2");
        element522.setName("ADC Value2");
        element522.setDataType("Integer");
        element522.setUsability(true);
        element522.setRewritable(false);
        resultList.add(element522);

        Element element523 = new Element();
        element523.setOid("1.3.6.1.4.1.17484.2.8.2.1.1.3");
        element523.setName("ADC Value3");
        element523.setDataType("Integer");
        element523.setUsability(true);
        element523.setRewritable(false);
        resultList.add(element523);

        Element element524 = new Element();
        element524.setOid("1.3.6.1.4.1.17484.2.8.2.1.1.4");
        element524.setName("ADC Value4");
        element524.setDataType("Integer");
        element524.setUsability(true);
        element524.setRewritable(false);
        resultList.add(element524);

        Element element525 = new Element();
        element525.setOid("1.3.6.1.4.1.17484.2.8.2.1.1.5");
        element525.setName("ADC Value5");
        element525.setDataType("Integer");
        element525.setUsability(true);
        element525.setRewritable(false);
        resultList.add(element525);

        Element element526 = new Element();
        element526.setOid("1.3.6.1.4.1.17484.2.8.2.1.1.6");
        element526.setName("ADC Value6");
        element526.setDataType("Integer");
        element526.setUsability(true);
        element526.setRewritable(false);
        resultList.add(element526);

        Element element527 = new Element();
        element527.setOid("1.3.6.1.4.1.17484.2.8.2.1.1.7");
        element527.setName("ADC Value7");
        element527.setDataType("Integer");
        element527.setUsability(true);
        element527.setRewritable(false);
        resultList.add(element527);

        Element element528 = new Element();
        element528.setOid("1.3.6.1.4.1.17484.2.8.2.1.1.8");
        element528.setName("ADC Value8");
        element528.setDataType("Integer");
        element528.setUsability(true);
        element528.setRewritable(false);
        resultList.add(element528);

        Element element531 = new Element();
        element531.setOid("1.3.6.1.4.1.17484.2.8.2.1.2.1");
        element531.setName("ADCThresholdLevel1");
        element531.setDataType("Integer");
        element531.setUsability(true);
        element531.setRewritable(true);
        resultList.add(element531);

        Element element532 = new Element();
        element532.setOid("1.3.6.1.4.1.17484.2.8.2.1.2.2");
        element532.setName("ADCThresholdLevel2");
        element532.setDataType("Integer");
        element532.setUsability(true);
        element532.setRewritable(true);
        resultList.add(element532);

        Element element533 = new Element();
        element533.setOid("1.3.6.1.4.1.17484.2.8.2.1.2.3");
        element533.setName("ADCThresholdLevel3");
        element533.setDataType("Integer");
        element533.setUsability(true);
        element533.setRewritable(true);
        resultList.add(element533);

        Element element534 = new Element();
        element534.setOid("1.3.6.1.4.1.17484.2.8.2.1.2.4");
        element534.setName("ADCThresholdLevel4");
        element534.setDataType("Integer");
        element534.setUsability(true);
        element534.setRewritable(true);
        resultList.add(element534);

        Element element535 = new Element();
        element535.setOid("1.3.6.1.4.1.17484.2.8.2.1.2.5");
        element535.setName("ADCThresholdLevel5");
        element535.setDataType("Integer");
        element535.setUsability(true);
        element535.setRewritable(true);
        resultList.add(element535);

        Element element536 = new Element();
        element536.setOid("1.3.6.1.4.1.17484.2.8.2.1.2.6");
        element536.setName("ADCThresholdLevel6");
        element536.setDataType("Integer");
        element536.setUsability(true);
        element536.setRewritable(true);
        resultList.add(element536);

        Element element537 = new Element();
        element537.setOid("1.3.6.1.4.1.17484.2.8.2.1.2.7");
        element537.setName("ADCThresholdLevel7");
        element537.setDataType("Integer");
        element537.setUsability(true);
        element537.setRewritable(true);
        resultList.add(element537);

        Element element538 = new Element();
        element538.setOid("1.3.6.1.4.1.17484.2.8.2.1.2.8");
        element538.setName("ADCThresholdLevel8");
        element538.setDataType("Integer");
        element538.setUsability(true);
        element538.setRewritable(true);
        resultList.add(element538);

        Element element541 = new Element();
        element541.setOid("1.3.6.1.4.1.17484.2.8.2.1.3.1");
        element541.setName("PingTrapFlag1");
        element541.setDataType("Integer");
        element541.setUsability(true);
        element541.setRewritable(true);
        resultList.add(element541);

        Element element542 = new Element();
        element542.setOid("1.3.6.1.4.1.17484.2.8.2.1.3.2");
        element542.setName("PingTrapFlag2");
        element542.setDataType("Integer");
        element542.setUsability(true);
        element542.setRewritable(true);
        resultList.add(element542);

        Element element543 = new Element();
        element543.setOid("1.3.6.1.4.1.17484.2.8.2.1.3.3");
        element543.setName("PingTrapFlag3");
        element543.setDataType("Integer");
        element543.setUsability(true);
        element543.setRewritable(true);
        resultList.add(element543);

        Element element544 = new Element();
        element544.setOid("1.3.6.1.4.1.17484.2.8.2.1.3.4");
        element544.setName("PingTrapFlag4");
        element544.setDataType("Integer");
        element544.setUsability(true);
        element544.setRewritable(true);
        resultList.add(element544);

        Element element545 = new Element();
        element545.setOid("1.3.6.1.4.1.17484.2.8.2.1.3.5");
        element545.setName("PingTrapFlag5");
        element545.setDataType("Integer");
        element545.setUsability(true);
        element545.setRewritable(true);
        resultList.add(element545);

        Element element546 = new Element();
        element546.setOid("1.3.6.1.4.1.17484.2.8.2.1.3.6");
        element546.setName("PingTrapFlag6");
        element546.setDataType("Integer");
        element546.setUsability(true);
        element546.setRewritable(true);
        resultList.add(element546);

        Element element547 = new Element();
        element547.setOid("1.3.6.1.4.1.17484.2.8.2.1.3.7");
        element547.setName("PingTrapFlag7");
        element547.setDataType("Integer");
        element547.setUsability(true);
        element547.setRewritable(true);
        resultList.add(element547);

        Element element548 = new Element();
        element548.setOid("1.3.6.1.4.1.17484.2.8.2.1.3.8");
        element548.setName("PingTrapFlag8");
        element548.setDataType("Integer");
        element548.setUsability(true);
        element548.setRewritable(true);
        resultList.add(element548);
        return resultList;
    }

    @Override
    public String toString() {
        return "DefaultDevice{"
                + "  listOfDefaultValues=" + listOfDefaultValues
                + '}';
    }
}
