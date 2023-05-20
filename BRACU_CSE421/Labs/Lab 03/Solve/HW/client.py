# Mohammad Shafkat Hasan
# Id: 19101077
# Lab 03 HW

# import socket module
import socket

# define client_program() function


def client_program():
    # as both code is running on same pc
    host = socket.gethostname()
    # socket server port number
    port = 5000
    # instantiate
    client_socket = socket.socket()
    # connect to the server
    client_socket.connect((host, port))
    # take input from user
    message = input("Enter amount of hours person works: ")
    # while loop until user not enter bye
    while message.lower().strip() != 'bye':
        # send message to server
        client_socket.send(message.encode())
        # receive response from server
        data = client_socket.recv(1024).decode()
        # dislay messange on client terminal
        print('Payable amount: ' + data)
        # again take input
        message = input("Enter amount of hours person works: ")
    # close the connection
    client_socket.close()

#Function call
if __name__ == '__main__':
    client_program()
