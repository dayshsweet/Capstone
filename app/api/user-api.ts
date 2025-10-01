export interface User {
  id: number;
  firstName: string;
  lastName: string;
  email: string;
  password: string;
}

const apiUrl = "http://localhost:8080/user";

export async function fetchUserProfile(userId: number): Promise<User | null> {
  try {
    const response = await fetch(`${apiUrl}/${userId}`);
    if (response.status === 200) {
      const data: User = await response.json();
      return data;
    } else {
      console.log("User not found");
      return null;
    }
  } catch (err) {
    console.log("Error fetching user", err);
    return null;
  }
}