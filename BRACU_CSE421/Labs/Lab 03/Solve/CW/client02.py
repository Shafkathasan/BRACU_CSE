#Mohammad Shafkat Hasan
#Id: 19101077
# Task02

import socket

HEADER=16
PORT=5050
SERVER=socket.gethostbyname(socket.gethostname())

#bind the address
ADDR=(SERVER, PORT) #binding IP and port
FORMAT="utf8"
DISCONNET_MSG="End"

client=socket.socket(socket.AF_INET, socket.SOCK_STREAM) # (ipv4, TCP)

client.connect(ADDR)


def send(msg):
    
    message = msg.encode(FORMAT)
    msg_length = len(message) 
    send_length = str(msg_length).encode(FORMAT)
    send_length+=b' '*(HEADER-len(send_length)) #finding the remaining length
    
    client.send(send_length)
    client.send(message)
    print(client.recv(2048).decode(FORMAT))
    
connected = True
while connected:
    input_message = input("Please enter your message\n")
    if input_message == "Done":
        connected = False
        send(DISCONNET_MSG)
    else:
        send(input_message)