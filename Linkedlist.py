class Node:
    def __init__(self,data):
        self.data = data 
        self.next = next
    
    def get_data(self):
        return self.data

    def get_next(self):
        return self.next

    def set_data(self, new_data):
        self.data = new_data

    def set_next(self, new_next):
        self.next = new_next

class LinkedList:
    def __init__(self):
        self.head = None 
        self.previous = None
        
    def isEmpty(self):
        return self.head == None 
    
    def delete(self, item):     
    current = self.head # we don't need the previous variable
    previous = None
    found = False
    while current is not None and not found:
        if current.get_data() == item:
            found = True
        else:
            previous = current
            current = current.get_next()
    # at this point we should have either reached to end of the list
    # and current is None
    # or we have found the node we were looking for
    if found and previous is not None:
        # delete it
        previous.set_next(current.get_next())
    elif found and previous is None:
        # removing head element
        self.head = None
    else:
        # nothing found
        print("Do whatever you want here") 
            
    def add(self,new_element):
        new_Node = Node(new_element)
        new_Node.next = self.head 
        self.head = new_Node 
        
    def printList(self):
        current = self.head 
        while current :
            print current.data 
            current = current.next 
    
    def 
    
        
    def search(self):
        
