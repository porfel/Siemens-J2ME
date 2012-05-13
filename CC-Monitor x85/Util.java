public class Util {
    
    private static String getBitValue(String in){
        String s = in.toUpperCase();
        System.out.println(s);
        if (s.length()<6)return null;
        for(int i = 0; i < 6; i++){
            if("0123456789ABCDEF".indexOf(s.charAt(i)) == -1)
                return null;
        }
        String OUT = "";
        
        for (int i=0; i<6; i++){
            if (s.charAt(i)=='0')OUT += "0000";
            if (s.charAt(i)=='1')OUT += "0001";
            if (s.charAt(i)=='2')OUT += "0010";
            if (s.charAt(i)=='3')OUT += "0011";
            if (s.charAt(i)=='4')OUT += "0100";
            if (s.charAt(i)=='5')OUT += "0101";
            if (s.charAt(i)=='6')OUT += "0110";
            if (s.charAt(i)=='7')OUT += "0111";
            if (s.charAt(i)=='8')OUT += "1000";
            if (s.charAt(i)=='9')OUT += "1001";
            if (s.charAt(i)=='A')OUT += "1010";
            if (s.charAt(i)=='B')OUT += "1011";
            if (s.charAt(i)=='C')OUT += "1100";
            if (s.charAt(i)=='D')OUT += "1101";
            if (s.charAt(i)=='E')OUT += "1110";
            if (s.charAt(i)=='F')OUT += "1111";
        }
        System.out.println("OUT: "+OUT);
        return OUT;
    }
    
    public static String decodeOther(String in){
        String process = getBitValue(in);
        if (process == null)return "Неверно введено значение";
        
        String OUT = "";
        
        String connected = process.substring(6,9);
        if (connected.compareTo("000")==0)OUT += "Аксессуар:\n<не подключен>\n";
        if (connected.compareTo("001")==0)OUT += "Аксессуар:\nDATA-кабель\n";
        if (connected.compareTo("010")==0)OUT += "Аксессуар:\nBluetooth-гарнитура\n";
        if (connected.compareTo("011")==0)OUT += "Аксессуар:\nЗарядное устройство\n";
        if (connected.compareTo("100")==0)OUT += "Аксессуар:\nНаушники\n";
        if (connected.compareTo("101")==0)OUT += "Аксессуар:\nKFZ\n";
        if (connected.compareTo("110")==0)OUT += "Аксессуар:\nДомашняя станция\n";
        if (connected.compareTo("111")==0)OUT += "Аксессуар:\n<не используется>\n";
        
        String simcard = process.substring(9,11);
        System.out.println("SIM-CARD: "+simcard);
        if (simcard.compareTo("00")==0)OUT += "SIM-карта:\n<нет>\n";
        if (simcard.compareTo("01")==0)OUT += "SIM-карта:\n3V SIM\n";
        if (simcard.compareTo("10")==0)OUT += "SIM-карта:\n5V SIM\n";
        if (simcard.compareTo("11")==0)OUT += "SIM-карта:\n<недоступно>\n";
        
        String flashcard = process.substring(11,14);
        if (flashcard.compareTo("000")==0)OUT += "MMC-карта:\n<нет>\n";
        if (flashcard.compareTo("001")==0)OUT += "MMC-карта:\n32MB\n";
        if (flashcard.compareTo("010")==0)OUT += "MMC-карта:\n64MB\n";
        if (flashcard.compareTo("011")==0)OUT += "MMC-карта:\n128MB\n";
        if (flashcard.compareTo("100")==0)OUT += "MMC-карта:\n256MB\n";
        if (flashcard.compareTo("101")==0)OUT += "MMC-карта:\n512MB\n";
        if (flashcard.compareTo("110")==0)OUT += "MMC-карта:\n1GB\n";
        if (flashcard.compareTo("111")==0)OUT += "MMC-карта:\n2GB\n";
        
        String rach = process.substring(14,15);
        if (rach.compareTo("0")==0)OUT += "RACH:\nДа\n";
        if (rach.compareTo("1")==0)OUT += "RACH:\nНет\n";
        
        String camera = process.substring(15,16);
        if (camera.compareTo("0")==0)OUT += "Камера:\nНет\n";
        if (camera.compareTo("1")==0)OUT += "Камера:\nЕсть\n";
        
        String emodev = process.substring(16,17);
        if (emodev.compareTo("0")==0)OUT += "EMO-Device:\nНет\n";
        if (emodev.compareTo("1")==0)OUT += "EMO-Device:\nДа\n";
        
        String emoapl = process.substring(17,18);
        if (emoapl.compareTo("0")==0)OUT += "EMO-Application:\nНет\n";
        if (emoapl.compareTo("1")==0)OUT += "EMO-Application:\nДа\n";
        
        return OUT;
    }
    
    public static String decodeSettings(String in){
        String process = getBitValue(in);
        if (process == null)return "Неверно введено значение";
        String OUT = "";
        
        String irda = process.substring(5,6);
        if (irda.compareTo("0")==0)OUT += "ИК порт:\nВыкл\n";
        if (irda.compareTo("1")==0)OUT += "ИК порт:\nВкл\n";
        
        String save = process.substring(6,7);
        if (save.compareTo("0")==0)OUT += "Экономия заряда:\nВыкл\n";
        if (save.compareTo("1")==0)OUT += "Экономия заряда:\nВкл\n";
        
        String ring = process.substring(7,8);
        if (ring.compareTo("0")==0)OUT += "Звук:\nВыкл\n";
        if (ring.compareTo("1")==0)OUT += "Звук:\nВкл\n";
        
        String light = process.substring(8,12);
        if (light.compareTo("0000")==0)OUT += "Подсветка:\nВыкл\n";
        if (light.compareTo("0001")==0)OUT += "Подсветка:\n10%\n";
        if (light.compareTo("0010")==0)OUT += "Подсветка:\n20%\n";
        if (light.compareTo("0011")==0)OUT += "Подсветка:\n30%\n";
        if (light.compareTo("0100")==0)OUT += "Подсветка:\n40%\n";
        if (light.compareTo("0101")==0)OUT += "Подсветка:\n50%\n";
        if (light.compareTo("0110")==0)OUT += "Подсветка:\n60%\n";
        if (light.compareTo("0111")==0)OUT += "Подсветка:\n70%\n";
        if (light.compareTo("1000")==0)OUT += "Подсветка:\n80%\n";
        if (light.compareTo("1001")==0)OUT += "Подсветка:\n90%\n";
        if (light.compareTo("1010")==0)OUT += "Подсветка:\n100%\n";
        
        String vibra = process.substring(12,13);
        if (vibra.compareTo("0")==0)OUT += "Вибрация:\nВыкл\n";
        if (vibra.compareTo("1")==0)OUT += "Вибрация:\nВкл\n";
        
        String off = process.substring(13,14);
        if (off.compareTo("0")==0)OUT += "Автовыключение:\nВыкл\n";
        if (off.compareTo("1")==0)OUT += "Автовыключение:\nВкл\n";
        
        String filter = process.substring(14,15);
        if (filter.compareTo("0")==0)OUT += "Фильтр:\nВыкл\n";
        if (filter.compareTo("1")==0)OUT += "Фильтр:\nВкл\n";
        
        String gprs = process.substring(15,16);
        if (gprs.compareTo("0")==0)OUT += "GPRS:\nВыкл\n";
        if (gprs.compareTo("1")==0)OUT += "GPRS:\nВкл\n";
        
        String bluetooth = process.substring(16,17);
        if (bluetooth.compareTo("0")==0)OUT += "Bluetooth:\nВыкл\n";
        if (bluetooth.compareTo("1")==0)OUT += "Bluetooth:\nВкл\n";
        
        String net = process.substring(17,18);
        if (net.compareTo("0")==0)OUT += "Автопоиск сети:\nВыкл\n";
        if (net.compareTo("1")==0)OUT += "Автопоиск сети:\nВкл\n";
        
        String dlight = process.substring(18,19);
        if (dlight.compareTo("0")==0)OUT += "Дин. свет:\nВыкл\n";
        if (dlight.compareTo("1")==0)OUT += "Дин. свет:\nВкл\n";
        
        String screensaver = process.substring(19,20);
        if (screensaver.compareTo("0")==0)OUT += "Заставка:\nВыкл\n";
        if (screensaver.compareTo("1")==0)OUT += "Заставка:\nВкл\n";
        
        String blackberry = process.substring(20,21);
        if (blackberry.compareTo("0")==0)OUT += "Blackberry:\nНет устройства\n";
        if (blackberry.compareTo("1")==0)OUT += "Blackberry:\nПодключен\n";
        
        return OUT;
    }
    
    public static String decodeNetwork(String in){
        String process = getBitValue(in);
        if (process == null)return "Неверно введено значение";
        String OUT = "";
        
        String status = process.substring(6,8);
        if (status.compareTo("00")==0)OUT += "Статус:\nНет сети\n";
        if (status.compareTo("01")==0)OUT += "Статус:\nРежим разговора\n";
        if (status.compareTo("10")==0)OUT += "Статус:\nПоиск сети\n";
        if (status.compareTo("11")==0)OUT += "Статус:\n<недоступно>\n";
        
        String perloc = process.substring(8,9);
        if (perloc.compareTo("0")==0)OUT += "PerLocUpdate:\nВыкл\n";
        if (perloc.compareTo("1")==0)OUT += "PerLocUpdate:\nВкл\n";
        
        String bs = process.substring(9,13);
        if (bs.compareTo("0000")==0)OUT += "Соты:\n0\n";
        if (bs.compareTo("0001")==0)OUT += "Соты:\n1\n";
        if (bs.compareTo("0010")==0)OUT += "Соты:\n2\n";
        if (bs.compareTo("0011")==0)OUT += "Соты:\n3\n";
        if (bs.compareTo("0100")==0)OUT += "Соты:\n4\n";
        if (bs.compareTo("0101")==0)OUT += "Соты:\n5\n";
        if (bs.compareTo("0110")==0)OUT += "Соты:\n6\n";
        if (bs.compareTo("0111")==0)OUT += "Соты:\n7\n";
        if (bs.compareTo("1000")==0)OUT += "Соты:\n8\n";
        if (bs.compareTo("1001")==0)OUT += "Соты:\n9\n";
        if (bs.compareTo("1010")==0)OUT += "Соты:\n10\n";
        if (bs.compareTo("1011")==0)OUT += "Соты:\n11\n";
        if (bs.compareTo("1100")==0)OUT += "Соты:\n12\n";
        if (bs.compareTo("1101")==0)OUT += "Соты:\n13\n";
        if (bs.compareTo("1110")==0)OUT += "Соты:\n14\n";
        if (bs.compareTo("1111")==0)OUT += "Соты:\n15\n";
        
        String signal = process.substring(13,14);
        if (signal.compareTo("0")==0)OUT += "Уровень сигнала:\nХороший\n";
        if (signal.compareTo("1")==0)OUT += "Уровень сигнала:\nПлохой\n";
        
        String mf = process.substring(14,17);
        if (mf.compareTo("000")==0)OUT += "Multiframe:\n2\n";
        if (mf.compareTo("001")==0)OUT += "Multiframe:\n3\n";
        if (mf.compareTo("010")==0)OUT += "Multiframe:\n4\n";
        if (mf.compareTo("011")==0)OUT += "Multiframe:\n5\n";
        if (mf.compareTo("100")==0)OUT += "Multiframe:\n6\n";
        if (mf.compareTo("101")==0)OUT += "Multiframe:\n7\n";
        if (mf.compareTo("110")==0)OUT += "Multiframe:\n8\n";
        if (mf.compareTo("111")==0)OUT += "Multiframe:\n9\n";
        
        String pbcch = process.substring(17,18);
        if (pbcch.compareTo("0")==0)OUT += "PBCCH:\nВыкл\n";
        if (pbcch.compareTo("1")==0)OUT += "PBCCH:\nВкл\n";
        
        return OUT;
    }
    
    public static String decodeBattary(String in){
        String process = getBitValue(in);
        if (process == null)return "Неверно введено значение";
        String OUT = "";
        
        String battary = process.substring(5,8);
        if (battary.compareTo("000")==0)OUT += "Батарея:\n<15%\n";
        if (battary.compareTo("001")==0)OUT += "Батарея:\n~15%\n";
        if (battary.compareTo("010")==0)OUT += "Батарея:\n~30%\n";
        if (battary.compareTo("011")==0)OUT += "Батарея:\n~45%\n";
        if (battary.compareTo("100")==0)OUT += "Батарея:\n~60%\n";
        if (battary.compareTo("101")==0)OUT += "Батарея:\n~80%\n";
        if (battary.compareTo("110")==0)OUT += "Батарея:\n~100%\n";
        if (battary.compareTo("111")==0)OUT += "Батарея:\nЗаряжается\n";
        
        String count = process.substring(8,12);
        if (count.compareTo("0000")==0)OUT += "Телефон заряжался:\n~0 раз\n";
        if (count.compareTo("0001")==0)OUT += "Телефон заряжался:\n~2 раза\n";
        if (count.compareTo("0010")==0)OUT += "Телефон заряжался:\n~4 раза\n";
        if (count.compareTo("0011")==0)OUT += "Телефон заряжался:\n~8 раз\n";
        if (count.compareTo("0100")==0)OUT += "Телефон заряжался:\n~16 раз\n";
        if (count.compareTo("0101")==0)OUT += "Телефон заряжался:\n~32 раза\n";
        if (count.compareTo("0110")==0)OUT += "Телефон заряжался:\n~64 раза\n";
        if (count.compareTo("0111")==0)OUT += "Телефон заряжался:\n~128 раз\n";
        if (count.compareTo("1000")==0)OUT += "Телефон заряжался:\n~256 раз\n";
        if (count.compareTo("1001")==0)OUT += "Телефон заряжался:\n~512 раз\n";
        if (count.compareTo("1010")==0)OUT += "Телефон заряжался:\n~1024 раза\n";
        if (count.compareTo("1011")==0)OUT += "Телефон заряжался:\n~2048 раз\n";
        if (count.compareTo("1100")==0)OUT += "Телефон заряжался:\n~4096 раз\n";
        if (count.compareTo("1101")==0)OUT += "Телефон заряжался:\n~8192 раза\n";
        if (count.compareTo("1110")==0)OUT += "Телефон заряжался:\n~16384 раза\n";
        if (count.compareTo("1111")==0)OUT += "Телефон заряжался:\n~32768 раз\n";
        
        String broken = process.substring(12,15);
        if (broken.compareTo("000")==0)OUT += "Прервано зарядок:\n0%\n";
        if (broken.compareTo("001")==0)OUT += "Прервано зарядок:\n14%\n";
        if (broken.compareTo("010")==0)OUT += "Прервано зарядок:\n29%\n";
        if (broken.compareTo("011")==0)OUT += "Прервано зарядок:\n43%\n";
        if (broken.compareTo("100")==0)OUT += "Прервано зарядок:\n57%\n";
        if (broken.compareTo("101")==0)OUT += "Прервано зарядок:\n71%\n";
        if (broken.compareTo("110")==0)OUT += "Прервано зарядок:\n86%\n";
        if (broken.compareTo("111")==0)OUT += "Прервано зарядок:\n100%\n";
        
        String usb = process.substring(15,18);
        if (usb.compareTo("000")==0)OUT += "Зарядок от USB:\n0%\n";
        if (usb.compareTo("001")==0)OUT += "Зарядок от USB:\n14%\n";
        if (usb.compareTo("010")==0)OUT += "Зарядок от USB:\n29%\n";
        if (usb.compareTo("011")==0)OUT += "Зарядок от USB:\n43%\n";
        if (usb.compareTo("100")==0)OUT += "Зарядок от USB:\n57%\n";
        if (usb.compareTo("101")==0)OUT += "Зарядок от USB:\n71%\n";
        if (usb.compareTo("110")==0)OUT += "Зарядок от USB:\n86%\n";
        if (usb.compareTo("111")==0)OUT += "Зарядок от USB:\n100%\n";
        
        String last = process.substring(18,21);
        if (last.compareTo("000")==0)OUT += "Работа без зарядки:\n<5 ч.\n";
        if (last.compareTo("001")==0)OUT += "Работа без зарядки:\n5 ч. - 1 д.\n";
        if (last.compareTo("010")==0)OUT += "Работа без зарядки:\n1 - 2 д.\n";
        if (last.compareTo("011")==0)OUT += "Работа без зарядки:\n2 - 4 д.\n";
        if (last.compareTo("100")==0)OUT += "Работа без зарядки:\n4 - 6 д.\n";
        if (last.compareTo("101")==0)OUT += "Работа без зарядки:\n6 - 8 д.\n";
        if (last.compareTo("110")==0)OUT += "Работа без зарядки:\n8 - 10 д.\n";
        if (last.compareTo("111")==0)OUT += "Работа без зарядки:\n>10 д.\n";
        
        String time = process.substring(21);
        if (time.compareTo("000")==0)OUT += "Время зарядки:\n<5 мин.\n";
        if (time.compareTo("001")==0)OUT += "Время зарядки:\n6 - 15 мин.\n";
        if (time.compareTo("010")==0)OUT += "Время зарядки:\n16 - 30 мин.\n";
        if (time.compareTo("011")==0)OUT += "Время зарядки:\n31 - 60 мин.\n";
        if (time.compareTo("100")==0)OUT += "Время зарядки:\n61 - 90 мин.\n";
        if (time.compareTo("101")==0)OUT += "Время зарядки:\n91 - 120 мин.\n";
        if (time.compareTo("110")==0)OUT += "Время зарядки:\n120 - 150 мин.\n";
        if (time.compareTo("111")==0)OUT += "Время зарядки:\n> 150 мин.\n";
        
        return OUT;
    }
    
    public static String decodeDiagnostic(String in){
        String process = getBitValue(in);
        if (process == null)return "Неверно введено значение";
        String OUT = "";
        
        String off = process.substring(5,8);
        if (off.compareTo("000")==0)OUT += "Выключений:\n0\n";
        if (off.compareTo("001")==0)OUT += "Выключений:\n1 - 2\n";
        if (off.compareTo("010")==0)OUT += "Выключений:\n3 - 5\n";
        if (off.compareTo("011")==0)OUT += "Выключений:\n6 - 9\n";
        if (off.compareTo("100")==0)OUT += "Выключений:\n10 - 14\n";
        if (off.compareTo("101")==0)OUT += "Выключений:\n15 - 21\n";
        if (off.compareTo("110")==0)OUT += "Выключений:\n22 - 29\n";
        if (off.compareTo("111")==0)OUT += "Выключений:\n>30\n";
        
        String exit = process.substring(8,11);
        if (exit.compareTo("000")==0)OUT += "(S)EXIT:\n0\n";
        if (exit.compareTo("001")==0)OUT += "(S)EXIT:\n1 - 2\n";
        if (exit.compareTo("010")==0)OUT += "(S)EXIT:\n3 - 5\n";
        if (exit.compareTo("011")==0)OUT += "(S)EXIT:\n6 - 9\n";
        if (exit.compareTo("100")==0)OUT += "(S)EXIT:\n10 - 14\n";
        if (exit.compareTo("101")==0)OUT += "(S)EXIT:\n15 - 21\n";
        if (exit.compareTo("110")==0)OUT += "(S)EXIT:\n22 - 29\n";
        if (exit.compareTo("111")==0)OUT += "(S)EXIT:\n>30\n";
        
        String refresh = process.substring(11,14);
        if (refresh.compareTo("000")==0)OUT += "Сбросов:\n0\n";
        if (refresh.compareTo("001")==0)OUT += "Сбросов:\n1 - 2\n";
        if (refresh.compareTo("010")==0)OUT += "Сбросов:\n3 - 5\n";
        if (refresh.compareTo("011")==0)OUT += "Сбросов:\n6 - 9\n";
        if (refresh.compareTo("100")==0)OUT += "Сбросов:\n10 - 14\n";
        if (refresh.compareTo("101")==0)OUT += "Сбросов:\n15 - 21\n";
        if (refresh.compareTo("110")==0)OUT += "Сбросов:\n22 - 29\n";
        if (refresh.compareTo("111")==0)OUT += "Сбросов:\n>30\n";
        
        String work = process.substring(14,17);
        if (work.compareTo("000")==0)OUT += "Телефон наработал:\n<1 д.\n";
        if (work.compareTo("001")==0)OUT += "Телефон наработал:\n1 - 2 д.\n";
        if (work.compareTo("010")==0)OUT += "Телефон наработал:\n3 - 6 д.\n";
        if (work.compareTo("011")==0)OUT += "Телефон наработал:\n7 - 12 д.\n";
        if (work.compareTo("100")==0)OUT += "Телефон наработал:\n13 - 20 д.\n";
        if (work.compareTo("101")==0)OUT += "Телефон наработал:\n21 - 30 д.\n";
        if (work.compareTo("110")==0)OUT += "Телефон наработал:\n31 - 42 д.\n";
        if (work.compareTo("111")==0)OUT += "Телефон наработал:\n>43 д.\n";
        
        String talk = process.substring(17,20);
        if (talk.compareTo("000")==0)OUT += "В режиме разговора:\n<1 ч.\n";
        if (talk.compareTo("001")==0)OUT += "В режиме разговора:\n1 - 3 ч.\n";
        if (talk.compareTo("010")==0)OUT += "В режиме разговора:\n4 - 7 ч.\n";
        if (talk.compareTo("011")==0)OUT += "В режиме разговора:\n8 - 12 ч.\n";
        if (talk.compareTo("100")==0)OUT += "В режиме разговора:\n13 - 18 ч.\n";
        if (talk.compareTo("101")==0)OUT += "В режиме разговора:\n19 - 25 ч.\n";
        if (talk.compareTo("110")==0)OUT += "В режиме разговора:\n26 - 33 ч.\n";
        if (talk.compareTo("111")==0)OUT += "В режиме разговора:\n>34 ч.\n";
        
        return OUT;
    }
    
    public static String decodeProvider(String in){
        String process = getBitValue(in);
        if (process == null)return "Неверно введено значение";
        String OUT = "";
        String MCCS1 = in.substring(0,4).toUpperCase();
        String MNCS1 = in.substring(4).toUpperCase();
        
        int MCC = 0;
        int MNC = 0;
        
        String MCCS = "";
        String MNCS = "";
        
        for (int i = MCCS1.length(); i>0; i--){
            MCCS += MCCS1.charAt(i-1);
        }
        
        for (int i = MNCS1.length(); i>0; i--){
            MNCS += MNCS1.charAt(i-1);
        }
        
        for (int i=0; i<MCCS.length(); i++){
            if (MCCS.charAt(i)=='0')MCC += 0*(16^i);
            if (MCCS.charAt(i)=='1')MCC += 1*(16^i);
            if (MCCS.charAt(i)=='2')MCC += 2*(16^i);
            if (MCCS.charAt(i)=='3')MCC += 3*(16^i);
            if (MCCS.charAt(i)=='4')MCC += 4*(16^i);
            if (MCCS.charAt(i)=='5')MCC += 5*(16^i);
            if (MCCS.charAt(i)=='6')MCC += 6*(16^i);
            if (MCCS.charAt(i)=='7')MCC += 7*(16^i);
            if (MCCS.charAt(i)=='8')MCC += 8*(16^i);
            if (MCCS.charAt(i)=='9')MCC += 9*(16^i);
            if (MCCS.charAt(i)=='A')MCC += 10*(16^i);
            if (MCCS.charAt(i)=='B')MCC += 11*(16^i);
            if (MCCS.charAt(i)=='C')MCC += 12*(16^i);
            if (MCCS.charAt(i)=='D')MCC += 13*(16^i);
            if (MCCS.charAt(i)=='E')MCC += 14*(16^i);
            if (MCCS.charAt(i)=='F')MCC += 15*(16^i);
        }
        
        MCC = MCC/2;
        
        for (int i=0; i<MNCS.length(); i++){
            if (MNCS.charAt(i)=='0')MNC += 0*(16^i);
            if (MNCS.charAt(i)=='1')MNC += 1*(16^i);
            if (MNCS.charAt(i)=='2')MNC += 2*(16^i);
            if (MNCS.charAt(i)=='3')MNC += 3*(16^i);
            if (MNCS.charAt(i)=='4')MNC += 4*(16^i);
            if (MNCS.charAt(i)=='5')MNC += 5*(16^i);
            if (MNCS.charAt(i)=='6')MNC += 6*(16^i);
            if (MNCS.charAt(i)=='7')MNC += 7*(16^i);
            if (MNCS.charAt(i)=='8')MNC += 8*(16^i);
            if (MNCS.charAt(i)=='9')MNC += 9*(16^i);
            if (MNCS.charAt(i)=='A')MNC += 10*(16^i);
            if (MNCS.charAt(i)=='B')MNC += 11*(16^i);
            if (MNCS.charAt(i)=='C')MNC += 12*(16^i);
            if (MNCS.charAt(i)=='D')MNC += 13*(16^i);
            if (MNCS.charAt(i)=='E')MNC += 14*(16^i);
            if (MNCS.charAt(i)=='F')MNC += 15*(16^i);
        }
        
        OUT = "MCC: "+MCC+" NC: "+MNC;
        
        return OUT;
    }
}
