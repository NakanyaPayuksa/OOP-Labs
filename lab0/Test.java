package lab0;

int getInteger(Scanner sc) {
    int userinput = 0;
    boolean ok = false;

    while (!ok) {
        try {
            userinput = sc.nextInt();
            ok = true;              // อ่านได้แล้ว ออกจากลูป
        } catch (InputMismatchException e) {
            sc.next();              // ทิ้งค่าที่กรอกผิด
        } catch (IllegalStateException e) {
            return 0;               // Scanner ถูกปิดแล้ว
        }
    }
    return userinput;
}