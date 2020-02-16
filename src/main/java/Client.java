public class Client {
    public static void main(String []args){

        USBPort usbPort = new USBConnector();
        usbPort.connectUSBPort();

        EthernetPort ethernetPort = new EthernetConnector();
        ethernetPort.connectEthernetPort();

        EthernetAdapter ethernetAdapter = new EthernetAdapter(usbPort);
        ethernetAdapter.connectEthernetPort();
    }
}
