public class RuntimeClass {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process myProcess;
        String[] processToExecuteW = {"notepad"};
        String[] processToExecuteL = {"gedit"};

        try
        {
            if(System.getProperty("os.name").toLowerCase().startsWith("windows"))
            {
                myProcess = rt.exec(processToExecuteW);
            }
            else
            {
                myProcess = rt.exec(processToExecuteL);
            }

            myProcess.waitFor();

        } catch (Exception e)
        {
            System.err.println("Comando desconocido: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Proceso finalizado");
        System.exit(0);
    }

}
