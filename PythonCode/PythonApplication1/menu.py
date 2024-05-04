rest_menu = {"dosa":10.99, "idli":5.66, "vada":8.00, "tea":4.5, "coffee":4.99, "mishal pav":7.99, "bonda":6.5, "sambharsadam":8.99}

def get_input():
    order = input("Enter some input:").strip()
    if order in rest_menu:
        return rest_menu[order]
    else:
        return "Not on menu"

def get_choice(liststr):
    if isinstance(liststr, list):
        while(True):
            choice = input(f"Choose from {liststr}:")
            if choice in liststr:
                return choice
    else:
        return f"Error: passed {liststr} is not a list"
     
