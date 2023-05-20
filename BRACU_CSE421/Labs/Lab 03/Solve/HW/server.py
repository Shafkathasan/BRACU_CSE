#Mohammad Shafkat Hasan
#Id: 19101077
#Lab 03 HW

# import socket module
import socket

# define server_program() function


def server_program():
    # get the hostname
    host = socket.gethostname()
    # initiate port number
    port = 5000
    # get instance
    server_socket = socket.socket()
    # bind host address and port together using tuple
    server_socket.bind((host, port))
    # configure how many client the server can listen simultaneously
    server_socket.listen(2)
    print("Server is Listening")
    # accept new connection
    conn, address = server_socket.accept()
    print("Connection from: " + str(address))
    # infinite while loop
    while True:
        # receive data stream. it won't accept data packet greater than 1024 bytes
        data = conn.recv(1024).decode()
        if not data:
            # if data is not received break
            break
        # print hourse reveived from client
        print("hours received: " + str(data) + " Hrs")
        print("Sending payable amount...")
        # convert string hours into int datatype
        data = int(data)
        pay = 0
        # if else condition for hours less than 40 or not
        if (data <= 40):
            pay = data * 200
        elif (data > 40):
            pay = ((data - 40) * 300) + 8000
        # store amount into data variable
        data = str(float(pay)) + " TK"
        # send data to client
        conn.send(data.encode())
    # close the connection
    print("Server closed")
    conn.close()

#Function call
if __name__ == '__main__':
    server_program()
