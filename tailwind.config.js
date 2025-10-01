/** @type {import('tailwindcss').Config} */
module.exports = {
  // NOTE: Update this to include the paths to all files that contain Nativewind classes.
  content: ["./App.tsx", "./app/**/*.{js,jsx,ts,tsx}", "./components/**/*.{js,jsx,ts,tsx}"],
  presets: [require("nativewind/preset")],
  theme: {
    extend: {
      colors: {
        primary: "#FF69B4", // Hot Pink
        secondary: "#FFB6C1", // Light Pink
        accent: "#FFD700", // Gold
        background: "#FFF0F5", // Lavender Blush
        textPrimary: "#333333", // Dark Gray
        textSecondary: "#666666" 
      }// Medium Gray
    },
  },
  plugins: [],
}