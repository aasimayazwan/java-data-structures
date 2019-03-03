class BinaryTree:
    def __init__(self,value):
        self.value = value 
        self.left_child = None 
        self.right_child= None 
        
    def insert_left(self,value):
        if self.left_child == None :
            self.left_child = BinaryTree(value)
        else:
            new_node = BinaryTree(value)
            #if the current node doesn't node doesn't have a left child we are creating a new node
            #setting it to current node's left_child 
            new_node.left_child = self.left_child
            self.left_child = new_node 
    
    def right_child(self,value):
        if self.right_child == None:
            self.right_child = BinaryTree(value)
        else:
            new_node = BinaryTree(value)
            new_node.right_child = self.right_child
            self.right_child = new_node.right_child
            
class BinarySearchTree:
    def __init__(self,value):
        self.value = value 
        self.left_child = None 
        self.right_child = None 
        
    def find_node(self,value):
        #Checking the value with the value of our node and value 
        #of the left child and the right child 
        if value < self.value and self.left_child :
            return self.left_child.find_node(value)
        if value > self.value and self.right_child:
            return self.right_child.find_node(value)
        
        return value == self.value 
    
    def find_minimum_value:
        if self.left_child:
            self.left_child.find_minimum_value()
        else:
            return self.value 
def bfs(self):
    queue = Queue()
    queue.put(self)
    
    while not queue.empty():
        current_node = queue.get()
        print(current_node.value)
        
        if current_node.left_child:
            queue.put(current_node.left_child)
            
        if currenr_node.right_child:
            queue.put(current_node.right_child)
