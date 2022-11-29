from tkinter import*
import json
import requests
def clicked():
    with open("C:/Users/vansh/Desktop/vanshev.txt", "w") as file:
        username = txt.get()
        url = f"https://api.github.com/users/{username}"
        user_data = requests.get(url).json()
        keys = ['company', 'created_at', 'email', 'id', 'name', 'url']
        data = user_data.keys()
        for i in data:
            if i in keys:
                file.write(f"{i}:{user_data[i]}" + '\n')
    lbl.configure(text = 'Нужные данные заипсаны в файл vanshev.txt')
root = Tk()
root.title('Ваньшев Михаил Егорович У-223(1)')
root.geometry('600x300')
lbl = Label(root,text = 'Напишите имя пользователя github',font = ('Times New Roman',14))
lbl.grid(column=0,row=0)
btn = Button(root,text = 'Клик!',command = clicked)
btn.grid(column=2,row=0)
txt = Entry(root,width=10)
txt.grid(column=1,row=0)
root.mainloop()
