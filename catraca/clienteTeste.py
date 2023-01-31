import socket
import threading

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect(('127.0.0.1', 6661))
#s.bind(('127.0.0.1', 6662))

# Create two threads: one for sending and one for receiving
def receive():
    while True:
        try:
            message = s.recv(88).decode('utf-8')
            print('MENSAGEM RECEBIDA:', message)
        except:
            print("An error occured!")
            s.close()
            break

def send():
    while True:
        message = input("Insira sua mensagem:") + '\n'
        s.send(message.encode('utf-8'))

receive_thread = threading.Thread(target=receive)
receive_thread.start()

send_thread = threading.Thread(target=send)
send_thread.start()