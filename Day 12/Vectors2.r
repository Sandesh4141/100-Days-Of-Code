# vectors -> vectors is sequence of element
# which has same data type 
# Vetors are like Arrays in C/C++ .
# indexing starts from 1.
# can create -> numeric, character vectors

# vectors are divided into 2 parts 
# 1. Atomic vectors -> elements must be same type
# 2. Lists -> elements can have different data type

# Atomic Vector
# 1. Numeric Data Type -> Decimal Values
# 2. Integer Data Type -> Numeric Value with no Fraction


#------------------------------------------------------

# Program to create numeric values
# Creating vectors using c() function

v1 <- c(1,3,4,5)
typeof(v1)

v2 <- c(1.3, 3.5, 6.5,5.4)
typeof(v2)

# if we have to create Integer Vector
# we have to apply 'L' at last

v3 <- c(42L, 545L, 454L)
typeof(v3)


# Charcter Data Type
# Charcter data type -> holds 1 Byte in memory
# Program to create char vectors

# by default numeric values are converted in charcter

v4 <- c('superman', 'black adam', 'batman', 'flash')
typeof(v4)
print(v4[1]) # indexing from 1 not from zero
print(v4[2])
print(v4[0]) # show character(0)


# Logical Data type (Booleans) 
# program to create logical vectors

v5 <- c(true, false) # TRUE FALSE (Capital) also work 
typeof(v5)


# ******* Another ways to create vectors in R *******
# 1. Using c() function -> one dimensional array (vector)
# 2. Using ':' operator -> Can create continous values
# 3. Using seq() function -> 

# **** program to create vector using : second way

v6 <- 1:5
print(v6) #output ->  [1] 1 2 3 4 5
typeof(v6)


# ******** Program to create vector using third way seq() function

seq_v <- seq(1, 100) # print elements from 1 to 100
print(seq_v) 

seq_v1 <- seq(1, 20, length.out = 10)
print(seq_v1)





