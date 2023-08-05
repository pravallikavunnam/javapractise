package classandobjects;

public class UserDevices {
    // Define a static array to hold user data
    private static String[][] userDevices = {
        {"Alice", "laptop", "smartphone", "tablet"},
        {"Bob", "desktop", "smartwatch", "smart speaker"},
        {"Charlie", "gaming PC", "VR headset", "smartphone"},
        {"David", "work laptop", "personal laptop", "smartphone"}
    };

    // Define a static method to retrieve a user's devices
    public static String[] getDevicesForUser(String username) {
        // Loop through the userDevices array to find the specified user
        for (String[] userDevice : userDevices) {
            if (userDevice[0].equals(username)) {
                // Return the devices for the specified user
                String[] devices = new String[userDevice.length - 1];
                System.arraycopy(userDevice, 1, devices, 0, userDevice.length - 1);
                return devices;
            }
        }
        // If the specified user is not found, return null
        return null;
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] aliceDevices = getDevicesForUser("Alice");
        if (aliceDevices != null) {
            System.out.println("Alice's devices: " + String.join(", ", aliceDevices));
        } else {
            System.out.println("User not found!");
        }
    }
}
